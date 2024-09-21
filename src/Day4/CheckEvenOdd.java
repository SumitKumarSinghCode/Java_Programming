package Day4;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args){
        //Check if Number is Even or add
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number to check It's Even or Odd: ");
        int number = scn.nextInt();
        if ((number%2) == 0){
            System.out.println("Even Number");
        } else{
            System.out.println("Odd Number");
        }
    }
}
