package Week1;
// Imports InputReader
import helpers.InputReader;
// Imports Calendar
import java.util.Calendar;

class YearBorn{
    public static void main(String args[]){
        // Allows the user to enter their age.
        Integer age;
        age=InputReader.getInt("Please enter your age: ");
        // Program calculates the current year and sets it as "year" variable.
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        // Calculates the year that the user was born by taking away their age from the current year.
        Integer yearBorn;
        yearBorn=year-age;
        // Output the year that the user was born.
        System.out.println("You were born in " + yearBorn);
    }
}