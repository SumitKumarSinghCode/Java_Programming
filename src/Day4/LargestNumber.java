package Day4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        //Largest of 3 numbers
        Scanner numb = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = numb.nextInt();
        System.out.println("Enter the second number: ");
        int b = numb.nextInt();
        System.out.println("Enter the third number: ");
        int c = numb.nextInt();
        System.out.println("a="+a+", b="+b+", c="+c);

        if ((a>b) && (a>c)){
            System.out.println(a+", a is greatest");
        }
        else if ((b>a) && (b>c)){
            System.out.println(b+", b is greatest");
        }
        else{
            System.out.println(c+", c is greatest");
        }
    }
}
