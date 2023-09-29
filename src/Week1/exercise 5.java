package Week1;
// Imports InputReader
import helpers.InputReader;

class Orders{
    public static void main(String args[]){
        // Allows the user to input the first number.
        Integer num1;
        num1=InputReader.getInt("Please enter your first number: ");
        // Allows the user to input the second number.
        Integer num2;
        num2=InputReader.getInt("Please enter your second number: ");
        // Outputs the numbers in the original and reverse order
        System.out.println("Original order: " + num1 + ", " + num2);
        System.out.println("Reverse order: " + num2 + ", " + num1);
    }
}
