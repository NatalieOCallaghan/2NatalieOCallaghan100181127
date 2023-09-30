package Week1;
// Imports InputReader
import helpers.InputReader;

class Average{
    public static void main(String args[]){
        // Allows the user to input the first number.
        Double num1;
        num1=InputReader.getDouble("Please enter your first number: ");
        // Allows the user to input the second number.
        Double num2;
        num2=InputReader.getDouble("Please enter your second number: ");
        // Works out the average and outputs it to the user.
        double average=(num1+num2)/2;
        System.out.println("Average = " + average);
    }
}