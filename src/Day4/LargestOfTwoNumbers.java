package Day4;

import java.util.Scanner;

public class LargestOfTwoNumbers {
    public static void main(String[] args){
        //Using If else
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int a = scn.nextInt();
        System.out.println("Enter the Second Number");
        int b = scn.nextInt();

        if (a>b){
            System.out.println(a+", a is greatest");
        }else{
            System.out.println(b+", b is greatest");
        }

        //Using ternary operator
        String result = (a>b)? a+", a is greatest" : b+", b is greatest";
        System.out.println(result);
    }
}
