package Week2;

// Imports InputReader
import helpers.InputReader;

class GradeConvertor{
    public static void main(String args[]){
        // Allows the user to enter their letter grade.
        String grade;
        grade=InputReader.getString("Please enter the letter grade you wish to convert: ");
        // If the grade is A, it outputs that the classification is a 1st.
        if(grade.equals("A"))
            System.out.println("University Undergraduate Classification: 1st");
        // If the grade is B, it outputs that the classification is a 2:1.
        else if(grade.equals("B"))
            System.out.println("University Undergraduate Classification: 2:1");
        // If the grade is C, it outputs that the classification is a 2:2.
        else if(grade.equals("C"))
        System.out.println("University Undergraduate Classification: 2:2");
        // If the grade is C, it outputs that the classification is a 3rd.
        else if(grade.equals("D"))
        System.out.println("University Undergraduate Classification: 3rd");
        // If the grade is an E, it outputs that the classification is an ordinary.
        else if(grade.equals("E"))
        System.out.println("University Undergraduate Classification: Ordinary");
        // If the grade is an F, it outputs that the classification is a fail.
        else if(grade.equals("F"))
        System.out.println("University Undergraduate Classification: Fail");
        // If the value entered for grade doesn't match any of the previous letters, it outputs an error and asks the user to restart.
        else 
        System.out.println("Invalid input. Please restart.");
    }
}