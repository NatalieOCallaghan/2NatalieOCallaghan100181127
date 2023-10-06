package Week2;
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

        // "if" statement to compare the value of the age to a value, which in this case is 18, and will output to the user if they are either 18 or over or under 18 years of age.
        if(age>=18){
            System.out.println("You are 18 years of age or older");
        }

        else {
            System.out.println("You are under 18 years of age");
        }
    }
}