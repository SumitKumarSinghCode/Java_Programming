package Day8;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        // String Methods

        // length() -> returns the length of the string (no. of characters in a string)
        String s = "Welcome";
        System.out.println(s.length()); // 7
        System.out.println("Welcome".length()); // 7

        // concat -> joining two strings
        String s1 = "Welcome";
        String s2 = " to java";
        String s3 = " automation";
        System.out.println(s1+s2); // Welcome to java (using normal + operator)
        System.out.println(s1.concat(s2)); // Welcome to java (using concat method)
        System.out.println(s1+s2+s3); // Welcome to java automation
        System.out.println(s1.concat(s2).concat(s3)); // Welcome to java automation
        System.out.println(s1.concat(s2+s3)); // Welcome to java automation

        // trim() -> remove spaces right and left side
        String str ="   Welcome   ";
        System.out.println("Length of String before trim: "+str.length()); // 13
        System.out.println(str); // this will print along with spaces. (   Welcome   )
        System.out.println(str.trim()); // this will remove the space from left and right. (Welcome)
        System.out.println("Length of the String after trim: "+str.trim().length()); // 7

        // charAt() -> returns a character from a string based on index
        s = "Welcome";
        System.out.println(s.charAt(0)); // W
        System.out.println(s.charAt(3)); // c

        // Contains() -> return true/false
        s = "Welcome";
        System.out.println(s.contains("We")); // true
        System.out.println(s.contains("come")); // true
        System.out.println(s.contains("we")); //false

        // equals(), equalsIgnoreCase() -> compare strings
        System.out.println();
        s1 = "welcome";
        s2 = "welcome";
        System.out.println(s1==s2); // true
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals("Welcome")); // false
        System.out.println(s1.equalsIgnoreCase("Welcome")); //true (It Ignores the case)

        // replace() -> replace single/multiple(sequance) of characters in a string.
        System.out.println();
        s = "welcome to selenium java selenium python selenium c#";
        System.out.println(s.replace('e','E')); //wElcomE to sElEnium java sElEnium python sElEnium c#
        System.out.println(s.replace("selenium","playwright")); // welcome to playwright java playwright python playwright c#

        // substring() -> extract sub string from the main string based on index
        // starting index from 0
        // ending index from 1
        System.out.println();
        s = "Welcome";
        System.out.println(s.substring(0,2)); // We
        System.out.println(s.substring((s.length()-2),(s.length()))); // me

        // toUpperCase()    toLowerCase
        System.out.println();
        s = "welcome";
        System.out.println(s.toUpperCase()); // WELCOME
        System.out.println(s.toLowerCase()); // welcome

        // split() -> split the string into multiple parts based on delimeter(@,., ,)
        System.out.println();
        s = "inbox.sumit.ks@gmail.com";
        String[] a= s.split("@");
        System.out.println(a[0]); // inbox.sumit.ks
        System.out.println(a[1]); // gmail.com

        System.out.println(Arrays.toString(a)); // [inbox.sumit.ks, gmail.com]
        System.out.println(a[0].concat('@'+a[1])); // inbox.sumit.ks@gmail.com

        // toCharArray() -> convert the string into character array
        System.out.println();
        System.out.println("toCharArray()");
        System.out.println(Arrays.toString(s.toCharArray())); // [i, n, b, o, x, ., s, u, m, i, t, ., k, s, @, g, m, a, i, l, ., c, o, m]

        //Ex-1
        System.out.println("Ex-1");
        String amount = "$15,20,55"; //Exp 152055
        amount = amount.replace("$","").replace(",","");
        System.out.println(amount);

        //Ex-2
        System.out.println();
        System.out.println("Ex-2");
        String email = "abc,123@xyz"; // Output:- abc , 123 , xyz
        String[] S1 = email.split(",");
        System.out.println(Arrays.toString(S1)); // [abc , 123@xyz]
        String[] S2 = S1[1].split("@");
        System.out.println(Arrays.toString(S2)); //[123 , xyz]
        System.out.println(S1[0]); // abc
        System.out.println(S2[0]); // 123
        System.out.println(S2[1]); // xyz

        //In one single statement
        System.out.println();
        System.out.println("Solution in one line");
        email = "abc,123@xyz"; // Output:- abc , 123 , xyz
        String first = email.split(",")[0];
        String second = email.split(",")[1].split("@")[0];
        String third = email.split(",")[1].split("@")[1];
        System.out.println(first); // abc
        System.out.println(second); // 123
        System.out.println(third); // xyz

        // Ex-3
        System.out.println();
        System.out.println("Ex-3");
        String s4 = "abc 123 xyz"; // if it has repeated delimeters then it will split in one split method. ()
        String[] array = s4.split(" ");
        System.out.println(Arrays.toString(array)); // [abc , 123 , xyz]

        System.out.println(s4.split(" ")[0]); // abc
        System.out.println(s4.split(" ")[1]); // 123
        System.out.println(s4.split(" ")[2]); // xyz

        // * % ^ & ( )    -> You cannot use as delimeters


        // Problem -> does "john" is in the string name or not
        String name = "John Kenedy";
        System.out.println(name.contains("john")); // false
        System.out.println(name.toLowerCase().contains("john")); // true
        System.out.println(name.replace('J','j').contains("john")); // true

    }
}
