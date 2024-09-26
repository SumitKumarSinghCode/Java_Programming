package Day5;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        //Reverse a number (% / = operators) example;- Input- 1234 Output- 4321.

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scn.nextInt();
        int rev =0;
        while(number!=0){
            rev = rev*10+(number%10); // Extract the last digit and add it to the result string
            number = (number/10); // Remove the last digit from the number
        }
        System.out.println(rev); // Print the reversed number
    }
}
