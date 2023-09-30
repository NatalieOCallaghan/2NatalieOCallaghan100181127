package Week1;
// Imports InputReader
import helpers.InputReader;

class FeetToMiles{
    public static void main(String args[]){
        // Sets a constant value for the amount of feet in miles.
        final int FEET_IN_MILES = 5280;
        
        // Allows the user to input amount of feet.
        Integer feet;
        feet=InputReader.getInt("Please enter the amount of feet you wish to convert to miles: ");

        // Works out the amount of miles and outputs it to the user.
        int miles=feet/FEET_IN_MILES;
        System.out.println(miles + " miles");
    }
}
