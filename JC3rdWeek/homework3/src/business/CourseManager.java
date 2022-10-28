package business;


import dataAccess.course.CourseDao;
import entities.Course;
import logging.Logger;

public class CourseManager {
private Logger[] loggers;
private CourseDao courseDao;
private Course[] courses;

CourseManager(Logger[] loggers, CourseDao courseDao,Course[] courses){
    this.loggers = loggers;
    this.courseDao = courseDao;
    this.courses = courses;
}
public void add(Course course) throws Exception {
    for(Course kurs : courses) {
        if (kurs.getCourseName() == course.getCourseName()) {
            throw new Exception("Course names have to be different");
        }
    }
if(course.getCoursePrice()<0){
    throw new Exception ("The course price can not be fewer than zero");
}
courseDao.add(course);
for(Logger logger:loggers){
    logger.log(course.getCourseName());
}
    }
}


