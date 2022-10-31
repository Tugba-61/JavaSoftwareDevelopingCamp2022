package homework.business;

import homework.dataAccess.InstructorDao;
import homework.entities.Instructor;
import homework.logging.Logger;


public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers){
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }
    public void add(Instructor instructor){
        instructorDao.add(instructor);
        for(Logger logger : loggers){
            logger.log(instructor.getInstructorName());
        }
    }
}
