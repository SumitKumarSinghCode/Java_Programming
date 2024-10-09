package Day11;

public class OverloadingMainMethod {
    // main Method overloading
    void main(int a) //1
    {
        System.out.println(a);
    }

    void main(int a, int b) //2
    {
        System.out.println("Sum:"+(a+b));
    }

    // Execution will always start from public static
    public static void main(String[] args){
        OverloadingMainMethod ov = new OverloadingMainMethod();
        ov.main(10); //10
        ov.main(100,200); //300

    }
}
