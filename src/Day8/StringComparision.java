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
        String s5 = "abc";
        String s6 = new String("abc");
        System.out.println(s5==s6); // false
        System.out.println(s5.equals(s6)); // true

        // Case-4
        System.out.println();
        String s7 ="abc";
        String s8 = new String("abc");
        String s9 = s8;
        System.out.println(s7==s8); // false
        System.out.println(s7.equals(s8)); // true

        System.out.println(s8==s9); // true (objects are same)
        System.out.println(s8.equals(s9)); // true (values of object are same)

    }
}
