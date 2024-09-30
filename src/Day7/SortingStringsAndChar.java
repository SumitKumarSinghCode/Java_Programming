package Day7;

import java.util.Arrays;

public class SortingStringsAndChar {
    public static void main(String[] args){
        // Sorting Char

        char c[] = {'D', 'C', 'B', 'A'};
        System.out.println("Arrays before Sorting....");
        Arrays.sort(c);
        System.out.println("Arrays after Sorting...");
        System.out.println(Arrays.toString(c));

        // Sorting Strings
        String s[] = {"Mango", "Banana", "Orange", "Apple"};
        System.out.println("Arrays before sorting...");
        Arrays.sort(s);
        System.out.println("Arrays after sorting...");
        System.out.println(Arrays.toString(s));
    }
}
