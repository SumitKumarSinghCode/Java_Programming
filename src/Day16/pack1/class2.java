package Day16.pack1;

// Accessing the private, default, protected, public (access modifier) variable, class and methods inside the package
// Here no import is needed because we are accessing within the same package

public class class2 {
    public static void main(String[] args){

        class1 class1obj = new class1();
        /*
        we cannot access the private class, variable and method inside the other class
        System.out.println(class1obj.privateVariable); //accessing private variable from class1
        class1obj.privateMethod; // accessing private method from class1
         */

        // We can access the default class, method and variable throughout the package
        System.out.println(class1obj.defaultVariable); // accessing default variable from class1
        class1obj.defaultMethod(); //accessing default method from class1

        /// we can access the protected class, methods and variable inside the package
        // We can also access protected class, variables and methods outside the package with inheritance
        System.out.println(class1obj.protectedVariable); // accessing protected variable from class1
        class1obj.protectedMethod(); //accessing the protected method from class1

        // We can access the public class, method and variables throughout out the project by importing the class
        // Here inheritance is not required
        System.out.println(class1obj.publicVariable); //accessing public variable
        class1obj.publicMethod(); // accessing the public method

    }
}
