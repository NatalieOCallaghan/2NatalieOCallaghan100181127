package Week1;
// Imports InputReader
import helpers.InputReader;
// Imports LocalDate
import java.time.LocalDate;
import java.time.Period;

class DaysOld{
    public static void main(String args[]){
        // Allows the user to enter the month of their birthdate
        Integer month;
        month = InputReader.getInt("Please enter the month you were born in: ");
        // Allows the user to enter the day of their birthdate
        Integer dayOfMonth;
        dayOfMonth = InputReader.getInt("Please enter the day of the month you were born in: ");
        // Allows the user to enter the year of their birthdate
        Integer year;
        year = InputReader.getInt("Please enter the year you were born in: ");
        // Stores the month, day and year as the user's birthdate
        LocalDate birthDate = LocalDate.of(year, month, dayOfMonth);
        System.out.println("birthdate: " + birthDate);
        // Fetches the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);
        // Works out how many days old the user is
        int daysOld;
        daysOld=Period.between(birthDate, currentDate).getDays();
        System.out.println("You are " + daysOld + " days old");
    }
}