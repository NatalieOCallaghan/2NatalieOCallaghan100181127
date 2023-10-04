package Week2;

// Imports InputReader
import helpers.InputReader;

class MarkConvertor{
    public static void main(String args[]){
        // Allows the user to enter their exam mark.
        Integer mark=InputReader.getInt("Please enter the exam mark: ");
        // If the mark is within 100 and 70, the grade is an A. 
        if(mark >= 70 && mark <= 100)
            System.out.println("Grade: A");
        // If the mark is within 69 and 60, the grade is a B.
        else if(mark >= 60 && mark <= 69)
            System.out.println("Grade: B");
        // If the mark is within 59 and 50, the grade is a C.
        else if(mark >= 50 && mark <= 59)
        System.out.println("Grade: C");
        // If the mark is within 49 and 40, the grade is a D.
        else if(mark >= 40 && mark <= 49)
        System.out.println("Grade: D");
        // If the mark is within 0 and 39, the grade is an F.
        else if(mark >= 0 && mark <= 39)
        System.out.println("Grade: F");
        // If the value entered for grade doesn't match any of the previous letters, it outputs an error and asks the user to restart.
        else 
        System.out.println("Invalid input. Please restart.");
    }
}