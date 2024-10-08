package Day10;

public class ConstructorDemo {
    int x,y;

    ConstructorDemo() // Default constructor
    {
        x=10;
        y=20;
    }

    ConstructorDemo(int a,int b) // Parametrized constructor
    {
        x=a;
        y=b;
    }

    void sum()
    {
        System.out.println(x+y);
    }

    public static void main(String[] args){
        /*
        ConstructorDemo cd= new ConstructorDemo(); // this will take default constructor
        cd.sum(); // 30
        */

        ConstructorDemo cd = new ConstructorDemo(100,200); // Parametrized constructor
        cd.sum(); // 300

    }
}
