package homework.entities;

public class Instructor {
    private int instructorId;
    private String instructorName;
    private String instructorLastname;
    private String instructorNationalIdentity;
    private double instructorRating;  //1-5 exp.--> 4.2

    public Instructor(){

    }

    public Instructor(int instructorId, String instructorName, String instructorLastname, String instructorNationalIdentity, double instructorRating){
        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.instructorLastname = instructorLastname;
        this.instructorNationalIdentity = instructorNationalIdentity;
        this.instructorRating = instructorRating;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorLastname() {
        return instructorLastname;
    }

    public void setInstructorLastname(String instructorLastname) {
        this.instructorLastname = instructorLastname;
    }

    public String getInstructorNationalIdentity() {
        return instructorNationalIdentity;
    }

    public void setInstructorNationalIdentity(String instructorNationalIdentity) {
        this.instructorNationalIdentity = instructorNationalIdentity;
    }

    public double getInstructorRating() {
        return instructorRating;
    }

    public void setInstructorRating(double instructorRating) {
        this.instructorRating = instructorRating;
    }
}
