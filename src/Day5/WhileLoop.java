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
        while (starting<=10)
        {
            if (starting%2==0) {
                System.out.println(starting);
            }
            starting++;
        }

        //from 1-10 specify each number is even/odd
        int st = 1;
        while(st<=10)
        {
            if(st%2==0)
            {
                System.out.println(st+" Even");
            }else{
                System.out.println(st+" odd");
            }
            st++;
        }

    }
}
