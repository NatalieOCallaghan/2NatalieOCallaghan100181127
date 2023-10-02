package Week2;

// Imports InputReader
import helpers.InputReader;

class TimesTableGenerator{
    public static void main(String args[]){
        // Creates and defaults the endProgram variable to "N" (No).
        String endProgram="N";
        do {
            // Allows the user to enter the number that they would like to see the times table of.
            Integer number=InputReader.getInt("Please enter the number you would like to see the multiplication table of: ");
            // for loop with a count from 1-12.
            for(int count=1; count<13; count++){
            // Takes the count value and uses it to calculate the current multiplication.
            System.out.println(count+" x " + number + " = " +((count)*number));
            }
            // Prompts the user to input "Y" or "N" depending upon if they wish to see another times table.
            endProgram=InputReader.getString("Do you wish to continue? (Y/N): ");
            if(endProgram.equals("N")){
                System.out.println("Goodbye");
            }
        }
        // This will loop the program if the answer to the previous question is "Y".
        while(endProgram.equals("Y"));
    }
}