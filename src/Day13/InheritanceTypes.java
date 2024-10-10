package Day13;

// Acquiring all the properties(variable) and behaviour(methods) form one class to another class is called Inheritance
        /*
        Types of Inheritance:-
        1) Single Inheritance-(One parent class and one child class)
        2) Multilevel Inheritance-(combining multiple single inheritance)
        3) Hierarchical Inheritance-(multiple child class derived from single parent class but each child has no relation between them)
        4) Multiple Inheritance-(Through Interfaces)Java does not support multiple inheritance with classes due to the "diamond problem." However, it can be achieved using interfaces, allowing a class to implement multiple interfaces.
        5) Hybrid Inheritance
         */

class A
{
    int a;

    void display(){
        System.out.println(a);
    }
}

class B extends A
{
    int b;

    void show(){
        System.out.println(b);
    }
}

class C extends B{
    int c;

    void print(){
        System.out.println(c);
    }
}

