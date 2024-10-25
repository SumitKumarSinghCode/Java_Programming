package Day16.pack1;

public class class1 {

    // private class, variable and method
    /*
    private int privateVariable=100
    private void privateMethod(){
        System.out.println("this is privateMethod method from class 1");
    }
     */

    // Default class, variable and method
    // We can access the default method and variable throughout the package
    // for default we don't have to write the default keyword
    int defaultVariable = 10;
    void defaultMethod(){
        System.out.println("this is defaultMethod method from class 1");
    }

    // protected class, method and variable
    // we can access the protected methods and variable inside the package
    // We can also access protected variables and methods outside the package with inheritance
    protected int protectedVariable = 20;
    protected void protectedMethod(){
        System.out.println("this is protectedMethod method from class 1");
    }

    // Public class, variable and methods
    // We can access the public class, method and variables throughout out the project by importing the class
    // Here inheritance is not required
    public int publicVariable=30;
    public void publicMethod(){
        System.out.println("this is publicMethod method from class 1");
    }



}

