package Day4;

import java.util.Scanner;

public class SmallestOf3Numbers {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scn.nextInt();
        System.out.println("Enter the second number");
        int b = scn.nextInt();
        System.out.println("Enter the third number");
        int c = scn.nextInt();

        if ((a<b) && (a<c)){
            System.out.println(a+", a is smallest");
        }else if((b<a) && (b<c)){
            System.out.println(b+", b is smallest");
        }else{
            System.out.println(c+", c is smallest");
        }
    }
}
