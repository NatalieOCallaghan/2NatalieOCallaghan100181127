package Week1;
// Imports InputReader
import helpers.InputReader;

class Interest{
    public static void main(String args[]){
        // Sets a constant value for the interest rate.
        final int INTEREST_RATE = 1;
        
        // Allows the user to input amount of feet.
        Double depositAmount;
        depositAmount=InputReader.getDouble("Please enter your deposit amount: ");

        // Works out the average and outputs it to the user.
        Double amountAfterInterest;
        amountAfterInterest=depositAmount+((depositAmount/100)*(INTEREST_RATE*12));
        System.out.println("Depositing £" + depositAmount + " will result in £" + amountAfterInterest + " after a year");
    }
}
