package Week3;

public class Course {
    private String courseCode;
    private String courseName;

    // Empty constructor 
    public Course() {

    }

    // Constructor that's populated
    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    // Returns the course code
    public String getCourseCode(){
        return this.courseCode;
    }

    // Returns the course name
    public String getCourseName(){
        return this.courseName;
    }

    // Prints out course information
    public void printCourse(){
        System.out.println();
    }
}
