package Day15;

interface Shape{
    int length = 10; // final and static (by default)
    int width = 20; // final and static (by default)

    void circle(); // Abstract method

    default void square(){
        System.out.println("This is square-- default method");
    }

    static void rectangle(){
        System.out.println("This is rectangle-- static method");
    }

}

public class InterfaceDemo implements Shape
{
    public void circle(){
        System.out.println("This is circle-- Abstract method");
    }

    void triangle(){
        System.out.println("This is triangle-- Normal class method");
    }

    public static void main(String[] args){

        //Scenario-1
        InterfaceDemo idobj = new InterfaceDemo();
        idobj.square(); // Output-(This is square-- default method) default Method (Calls the default method through class object if not overridden)
        idobj.circle(); // Abstract Method  Output-(This is circle-- Abstract method)
        idobj.triangle(); //Output-(This is triangle-- Normal class method) Normal class Method.
        System.out.println(Shape.length+" "+ Shape.width); // Output-(10 20) Accessing (final and static) variable of Interface without any object. (This is good practice)
        System.out.println(idobj.length+" "+ idobj.width); // Output-(10 20) Accessing (final and static) variable of Interface through object. (This is bad practice)
        /*
        1) Static methods in interfaces were introduced in Java 8. These methods can have a body and are used for utility or helper methods.
        2) You cannot call a static method of an interface using an object of a class that implements the interface. You must use the interface name to call the static method.
         */
        Shape.rectangle(); // Static Methods can be accessed directly through interface


        //Scenario-2



    }
}
