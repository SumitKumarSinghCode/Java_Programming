package Day5;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        //Reverse a number (% / = operators) example;- Input- 1234 Output- 4321.

        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        String result = "";
        while(number>0){
            result+=number%10;
            number=(number/10);
        }
        System.out.println(result);
    }
}
