package Day8;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){

        // Take a string as an input from user and reverse it
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scn.next();
        String rev ="";

        System.out.println("Input String:"+str);

        // Method-1 By using charAt() method
        for(int  i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println("Reversed String:"+rev);

        // Method-2 By converting the string into char array

    }
}
