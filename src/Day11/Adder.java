package Day11;

public class Adder {

    int a = 10;
    int b = 20;

    // Method Overloading (Polymorphism is a programming concept in Java that allows objects to perform a single action in different ways)
    void sum()  //1
    {
        System.out.println(a+b);
    }

    void sum(int x,int y) //2
    {
        System.out.println(x+y);
    }

    void sum(double x,double y) //3
    {
        System.out.println(x+y);
    }

    void sum(int x,double y) //4
    {
        System.out.println(x+y);
    }

    void sum(double y,int x) //5
    {
        System.out.println(x+y);
    }

}
