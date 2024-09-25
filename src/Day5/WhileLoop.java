package Day5;

public class WhileLoop {
    public static void main(String[] args){
        //Print number from 1-10 numbers
        int i = 1; //initialization
        while (i<=10) //Condition
        {
            System.out.println(i);
            i++; //incrementation
        }

        //Print Hello message 10 times
        int start = 1; //Initialization
        while(start<=10) //Condition
        {
            System.out.println("Hello");
            start++; //incrementation
        }

        //Print Even numbers between 1-10
        int starting = 1;
        while((starting<=10) && (i%2==0))
        {
            System.out.println(i);
            i++;
        }

    }
}
