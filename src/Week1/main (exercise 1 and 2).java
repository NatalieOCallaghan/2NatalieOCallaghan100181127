package Week1;
// Imports InputReader
import helpers.InputReader;

class Test{
    public static void main(String args[]){
        String name;
        // Prompts the user to enter their name and then sets it as the "name" variable.
        name=InputReader.getString("Please enter your name: ");
        System.out.println("Hello " + name);
    }
}
