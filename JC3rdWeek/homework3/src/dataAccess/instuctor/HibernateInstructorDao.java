package dataAccess.instuctor;

import entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitimci Hibernate ile veritabanına eklendi");
    }
}
