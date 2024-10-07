package Day8;

public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args){

        // String- Immutable(can not change)

        String s = "Welcome";
        String s2 = "to java";
        System.out.println(s.concat(s2)); // Welcometo java
        System.out.println(s); // Welcome (when we apply any method to Sting it dosenot effect original value)


    }
}
