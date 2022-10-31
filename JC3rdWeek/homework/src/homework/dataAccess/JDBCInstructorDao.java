package homework.dataAccess;

import homework.entities.Instructor;

public class JDBCInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitmen JDBC ile veritabanına eklendi");
    }
}
