package Day4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        //Largest of 3 numbers
        Scanner numb = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = numb.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = numb.nextInt();
        System.out.println("Enter the third number: ");
        int n3 = numb.nextInt();
        System.out.print(n1+" "+n2+" "+n3);
    }
}
