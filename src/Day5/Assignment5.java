package Day5;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args){
        //Find Sum of digits of a number example:- Input= 1234 Output= 10

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scn.nextInt();
        int digit = 0;
        int sum_of_digits = 0;
        while(number!=0){
            digit = (number%10);
            sum_of_digits+=digit;
            number/=10;
        }
        System.out.println("Sum of digits of the given number is "+sum_of_digits);

    }
}
