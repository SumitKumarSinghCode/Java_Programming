package Day11;

import Day6.Arrays;

public class PassingParamsToMainMethod {
    public static void main(String[] a){

        // Printing main methods array elements
        for(String s:a){
            System.out.println(s);
        }
        System.out.println(a.length);
    }
}
