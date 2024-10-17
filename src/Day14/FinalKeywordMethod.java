package Day14;

// When a method is declared as final, it cannot be overridden by subclasses.
// This is useful when we want to prevent modification of a method's behavior in derived classes.

class Test1
{
    final void m1()
    {
        System.out.println("m1 method from Test1 class");
    }
}

class Test2 extends Test1
{
    /*
    void m1() // it cannot override final method from Test1
    {
        System.out.println("m1 method from Test2 class");
    }
     */
}

public class FinalKeywordMethod {
    public static void  main(String[] args){

    }
}
