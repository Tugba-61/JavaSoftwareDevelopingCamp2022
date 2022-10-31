import homework.business.CategoryManager;
import homework.business.CourseManager;
import homework.business.InstructorManager;
import homework.dataAccess.*;
import homework.entities.Category;
import homework.entities.Course;
import homework.entities.Instructor;
import homework.logging.DatabaseLogger;
import homework.logging.FileLogger;
import homework.logging.Logger;
import homework.logging.MailLogger;

public class Main {
    public static void main(String[] args) throws Exception {

        Instructor instructor = new Instructor();
        instructor.setInstructorId(999);
        instructor.setInstructorName("Tugba");
        instructor.setInstructorLastname("Ornek");
        instructor.setInstructorNationalIdentity("123");
        instructor.setInstructorRating(4.8);

        System.out.println(instructor.getInstructorName());

        Course course1 = new Course(78,"Phyton",4.6,129);
        Course course2 = new Course(79,"Resim",4.7,-5);
        Course course3 = new Course(80,"Resim",3.9,150);

        Category category1 = new Category(14,"Programlama");
        Category category2 = new Category(15,"El Sanatları");


        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
        instructorManager.add(instructor);

        CategoryManager categoryManager = new CategoryManager(new JDBCCategoryDao(),loggers);
categoryManager.add(category1);

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course1);
        courseManager.add(course2);
        courseManager.add(course3);
  }
}