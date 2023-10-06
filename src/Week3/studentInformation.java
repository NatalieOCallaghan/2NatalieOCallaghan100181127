package Week3;

class studentInformation {
    public static void main(String[] args) {
        // Creates a student object from the student class.
        Student student1 = new Student(100181127, "Natalie");
        
        // Creates a course object from the course class.
        Course course1= new Course("CO452", "Programming Concepts");

        // Prints the course details
        course1.printCourse();
        student1.enroll(course1);

        // Prints student information
        student1.printStudent();
    }
}
