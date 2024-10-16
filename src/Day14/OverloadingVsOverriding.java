package Day14;

class ABC
{
    void m1(int a)
    {
        System.out.println(a);
    }

    void m2(int b)
    {
        System.out.println(b);
    }
}

class XYZ extends ABC
{
    void m1(int a)
    {
        System.out.println(a*a); // Overriding
    }

    void m2(int b) // Overriding
    {
        System.out.println(b);
    }

    void m2(int a, int b) // Overloading
    {
        System.out.println(a+b);
    }

}
public class OverloadingVsOverriding {
    public static void main(String args[]){
        XYZ xyz = new XYZ();
        xyz.m1(10); //100 //method from XYZ class will be invoked
        xyz.m2(10,20); //30
    }
}
