package homework.entities;

public class Course {
   private int courseId;
    private String courseName;
    private double courseRating;
    private double coursePrice;

    public Course(){

    }
    public Course(int courseId, String courseName, double courseRating, double coursePrice){
        this.courseId = courseId ;
        this.courseName = courseName;
        this.courseRating = courseRating;
        this.coursePrice = coursePrice;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCourseRating() {
        return courseRating;
    }

    public void setCourseRating(double courseRating) {
        this.courseRating = courseRating;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }
}

