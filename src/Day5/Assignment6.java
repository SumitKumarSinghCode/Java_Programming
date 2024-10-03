package Day5;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args){
        // Check the number is prime or not

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scn.nextInt();
        int count = 0;

        if(n>1)
        {
            for(int i=1; i<=n; i++)
            {
                if(n%i==0)
                {
                count++;
                }

            }
            if (count==2)
            {
                System.out.println(n+" is a Prime Number");
            }
            else
            {
                System.out.println(n+" is not a Prime Number");
            }

        }
        else
        {
            System.out.println(n+" is not a Prime Number");
        }

    }
}
