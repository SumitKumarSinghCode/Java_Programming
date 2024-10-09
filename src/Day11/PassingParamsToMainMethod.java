package Day11;

public class PassingParamsToMainMethod {
    public static void main(String[] a){

        // we can only pass parameters in main method while run time
        // Printing main methods array elements
        for(String s:a){
            System.out.println(s);
        }
        System.out.println(a.length);
    }
}
