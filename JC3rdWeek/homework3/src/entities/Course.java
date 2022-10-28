package entities;

public class Course {
    private int courseId;
    private String courseName;
    private double coursePrice;
    private double courseRating;
public Course(){

}
public Course(int courseId, String courseName, double coursePrice, double courseRating){
    this.courseId = courseId;
    this.courseName = courseName;
    this.coursePrice = coursePrice;
    this.courseRating = courseRating;
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

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public double getCourseRating() {
        return courseRating;
    }

    public void setCourseRating(double courseRating) {
        this.courseRating = courseRating;
    }
}
