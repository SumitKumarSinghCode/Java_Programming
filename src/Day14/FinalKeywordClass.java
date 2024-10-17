package Day14;
/*
1) When a class is declared as final, it cannot be subclassed or extended.
2) This is useful when you want to create an immutable class or prevent inheritance for security or design reasons.
 */

final class A
{
    void m1()
    {
        System.out.println("This is m1 method from A class");
    }
}

/*
We cannot extend class, When a class is declared as final

class B extends A
{
    void m1()
    {
        System.out.println("This is m1 method from B class");
    }
}
 */