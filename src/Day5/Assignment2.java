package Day5;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
        //Palindrome Number Example:-input= 121 output= "Is Palindrome Number"

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scn.nextInt();
        int duplicate = number;
        StringBuilder result = new StringBuilder();
        while(number>0){
            result.append(number%10);
            number /=10;
        }
        if (duplicate == Integer.parseInt(result.toString())){
            System.out.println("Is Palindrome Number");
        }else{
            System.out.println("Is Not Palindrome Number");
        }
    }
}
