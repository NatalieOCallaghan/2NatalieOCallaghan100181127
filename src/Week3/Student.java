package Week3;

public class Student {
    private int studentID;
    private String studentName;
    Course myCourse;

    // Empty constructor
    public Student(){

    }

    // Constructor that's populated
    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    // Prints out student information
    public void printStudent(){
        System.out.println(studentID + " : " + studentName);
        System.out.println(myCourse.getCourseCode() + ", " + myCourse.getCourseName());
    }

    // Enrol
    public void enroll(Course course){
        this.myCourse = course;
    }
}
