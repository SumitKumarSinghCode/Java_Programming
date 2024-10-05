package Day8;

import java.util.Arrays;
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
        System.out.println("Reversed String By using charAt() method: "+rev);



        // Method-2 By converting the string into char array
        System.out.println();
        String string = "Welcome";
        String reverse = "";
        char[] char_array = string.toCharArray(); // this will convert string into char type of array
        System.out.println("String into char array: "+Arrays.toString(char_array)); //[W, e, l, c, o, m, e]

        for(int i=char_array.length-1; i>=0;i--)
        {
            reverse+=char_array[i];
        }
        System.out.println("Reversed array By converting the string into char array: "+reverse); //emocleW


        // Method-3 By using builtin method(StringBuffer class)
        System.out.println();
        StringBuffer S = new StringBuffer("Welcome");
        System.out.println("Reverse String using StringBuffer class: "+S.reverse());

        // Method- 4 By using StringBuilder class
        System.out.println();
        StringBuilder s = new StringBuilder("Welcome");
        System.out.println("Reverse String using StringBuilder class: "+s.reverse());

    }
}
