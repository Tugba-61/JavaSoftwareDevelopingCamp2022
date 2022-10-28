package entities;

public class Instructor {
    private int id;
    private String name;
    private String lastName;
    private String nationalIdentity;
    private double instructorRating;  //1-5 exp.--> 4.2

    public Instructor(){

    }

    public Instructor(int id, String name, String lastName, String nationalIdentity, double instructorRating){
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.nationalIdentity = nationalIdentity;
        this.instructorRating = instructorRating;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    public double getInstructorRating() {
        return instructorRating;
    }

    public void setInstructorRating(double instructorRating) {
        this.instructorRating = instructorRating;
    }
}
