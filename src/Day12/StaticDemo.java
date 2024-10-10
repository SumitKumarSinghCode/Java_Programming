package Day12;
// Static variable and static methods can be accessed directly without creating any object
public class StaticDemo {

    static int a=10; //Static variable
    int b=20; //NonStatic variable

    static void m1() //Static Method
    {
        System.out.println("This is m1 Static Method");
    }

    void m2() //Nonstatic Method
    {
        System.out.println("This is m2 Nonstatic Method");
    }

    public static void main(String[] args){
        // Static Methods can access static variable and static Methods directly.
        System.out.println(a); // 10
        m1(); // This is m1 Static Method

        /*
        System.out.println(b); // We cannot access b because b is non-static variable
        m2(); // We cannot access m2() because m2() is non-static method
         */

        // Nonstatic Methods can access static variable and static Methods only through object.
        StaticDemo sd = new StaticDemo();
        System.out.println(sd.b); // 20
        sd.m2(); // This is m2 Nonstatic Method
    }

}
