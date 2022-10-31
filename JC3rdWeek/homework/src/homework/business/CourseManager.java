package homework.business;

import homework.dataAccess.CourseDao;
import homework.entities.Course;
import homework.logging.Logger;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    private Course[] courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers){
        this.courseDao = courseDao;
        this.loggers = loggers;

    }
    public void add(Course course) throws Exception {
        for(Course kurslar : courses){
            if(kurslar.getCourseName() == course.getCourseName()){
                throw new Exception("Course name has already been exist");
            }
        }
        if(course.getCoursePrice() < 0){
            throw new Exception("Course price can not be fewer than 0");
        }
        courseDao.add(course);
        for(Logger logger : loggers){
            logger.log(course.getCourseName());
        }
    }

}
