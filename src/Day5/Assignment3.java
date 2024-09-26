package Day5;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args){
        //Count number of digits in a number Example:- Input= 12345 Output= 5 digits
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scn.nextInt();
        int count = 0;
        if (number==0){
            count++;
        }
        while(number!=0){
            number/=10;
            count++;

        }
        System.out.println(count+" Digits");

    }
}
