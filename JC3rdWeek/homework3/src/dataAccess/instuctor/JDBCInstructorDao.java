package dataAccess.instuctor;

import entities.Instructor;

public class JDBCInstructorDao implements InstructorDao{
    public void add(Instructor instructor) {
        System.out.println("Eğitimci JDBC ile veritabanına eklendi");
    }
}
