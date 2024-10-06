package Day8;

public class StringComparision {
    public static void main(String[] args){

        // Case-1

        String s1 = "welcome";
        String s2 = "welcome";

        System.out.println(s1==s2); //true
        System.out.println(s1.equals(s2)); //true

        // Case-2
        System.out.println();
        String s3 = new String("welcome");
        String s4 = new String("welcome");
        System.out.println(s3==s4); //false (== is used for comparing objects that's why it is returning false)
        System.out.println(s3.equals(s4)); // true (equals() method is used for comparing the values)

        // Case-3
        System.out.println();
        
    }
}
