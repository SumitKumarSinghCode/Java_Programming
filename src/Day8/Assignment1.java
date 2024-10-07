package Day8;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        // Check String is palindrome or not
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = scn.next();
        System.out.println("Input String is: "+s);

        String rev = "";
        for (int i=s.length()-1;i>=0;i--)
            rev += s.charAt(i);

        if(s.equals(rev))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }

    }
}
