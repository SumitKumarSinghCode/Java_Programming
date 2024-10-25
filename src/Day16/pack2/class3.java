package Day16.pack2;

import Day16.pack1.class1;

public class class3 extends class1 {
    public static void main(String[] args){
        // Accessing the private, default, protected, public  (access modifier) variable, class and methods outside the package
        // Here import is needed because we are accessing in another package

        class1 obj1 = new class1();
        // accessing private class, variable and methods from other package
        // System.out.println(obj.privateVariable); // we cannot access
        // obj.privateMethod; // we cannot access


        // accessing default class, variable and methods from other package
        // Default access allows variables and methods to be accessed only within the same package. They are not visible to classes in other packages.
        // System.out.println(obj.defaultVariable); // we cannot access
        // obj.defaultMethod(); // we cannot access


        // accessing protected class, variable and methods from other package
        // We can do it by extending class3 by class1
        class3 obj2 = new class3();
        System.out.println(obj2.protectedVariable); // 20
        obj2.protectedMethod(); // this is protectedMethod method from class 1


        //accessing public class, variable and methods from other package
        System.out.println(obj1.publicVariable); // 30
        obj1.publicMethod(); // this is publicMethod method from class 1

    }
}
