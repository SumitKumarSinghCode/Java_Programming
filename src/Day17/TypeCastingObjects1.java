package Day17;

class Parent{
    String name="Sumit";

    void m1(){
        System.out.println("this is m1 form parent class");
    }
}

class Child extends Parent{
    int id=101;

    void m2(){
        System.out.println("this is m2 form child class");
    }
}

public class TypeCastingObjects1 {
    public static void main(String[] args){
        /*
        Child ch=new Child();
        System.out.println(ch.name); // Sumit
        ch.m1(); // this is m1 form parent class
         */

        Parent p=new Child(); // Upcasting
        System.out.println(p.name); // Sumit
        p.m1(); // this is m1 form parent class
        // System.out.println(p.id); // we cannot access child class variable
        // p.m2(); // we cannot access child class methods.


/*
        // Down casting
        Parent pobj=new Parent();
        Child cobj=(Child)pobj; // this will give Runtime Error
        // Accessing variables and methods from parent class
        System.out.println(cobj.name);
        cobj.m1();

        // Accessing variables and methods from child class
        System.out.println(cobj.id);
        cobj.m2();
 */

    }
}
