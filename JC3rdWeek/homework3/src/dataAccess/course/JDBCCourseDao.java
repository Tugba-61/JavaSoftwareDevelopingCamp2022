package dataAccess.course;

import entities.Course;

public class JDBCCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println("Kurs JDBC ile veritabanına eklendi");
    }
}
