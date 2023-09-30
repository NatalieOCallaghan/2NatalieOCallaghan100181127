package Week1;
// Imports InputReader
import helpers.InputReader;

class Rectangle{
    public static void main(String args[]){
        // Allows the user to enter the height of the rectangle.
        Integer height;
        height=InputReader.getInt("Please enter the height of the rectangle: ");
        // Allows the user to enter the length of the rectangle. 
        Integer length;
        length=InputReader.getInt("Please enter the length of the rectangle: ");
        // Calcultes the area and perimeter and outputs them to the user.
        int area=length*height;
        int perimiter=(height+length)*2;
        System.out.println("Area = " + area);
        System.out.println("Perimiter = "+ perimiter);
    }
}
