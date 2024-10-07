package Day8;

public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args){

        // String- Immutable(can not change)

        String s = "Welcome";
        String s2 = "to java";
        System.out.println(s.concat(s2)); // Welcometo java
        System.out.println(s); // Welcome (when we apply any method to Sting it dosenot effect original value)

        // StringBuffer - Mutable(can change)
        System.out.println();
        StringBuffer S = new StringBuffer("welcome");
        S.append("to java"); // (permanent change in the String)
        System.out.println(S); // welcometo java

        // StringBuilder - mutable(can change)
        System.out.println();
        StringBuilder str = new StringBuilder("welcome");
        str.append("to java"); // (permanent change in the String)
        System.out.println(str); // welcometo java

    }
}
