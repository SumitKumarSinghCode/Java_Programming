package Day4;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args){

        //if Conditional Statement
        int person_age1 = 19;
        if (person_age1 >= 18){
            System.out.println("Eligible for Vote");
        }

        //if else Conditional Statement
        int person_age2 = 17;
        if (person_age2>=18){
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Note Eligible for vote");
        }

        //Check if Number is Even or add
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number to check It's Even or Odd: ");
        int number = scn.nextInt();
        if ((number%2) == 0){
            System.out.println("Even Number");
        } else{
            System.out.println("Odd Number");
        }

        //Check the number is Positive/Negative/Zero
        Scanner skan = new Scanner(System.in);
        System.out.print("Enter a number to check wether it is Positive/Negative/Zero: ");
        int num = skan.nextInt();
        if (num>0){
            System.out.println("Positive Number");
        } else if (num<0) {
            System.out.println("Negative Number");
        }else{
            System.out.println("Zero");
        }

    }
}
