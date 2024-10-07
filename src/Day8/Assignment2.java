package Day8;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
        // Remove junk or special characters in a string (wel&&)

        String s = "wel&&^^%%*())*come";
        s = s.replace("&","").replace("^","").replace("%","").replace("*","").replace("(","").replace(")","");
        System.out.println(s); // welcome

    }
}
