package Week2;

class OnlyEven{
    public static void main(String args[]){
        // for loop that will run 10 times.
        for(int count=0; count<20; count++){
        // Takes the count value and adds 2 to it every time the loop goes round, this makes the current number even.
            System.out.println(count++);
        }
    }
}