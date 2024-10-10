package Day13;

// Acquiring all the properties(variable) and behaviour(methods) form one class to another class is called Inheritance
        /*
        Types of Inheritance:-
        1) Single Inheritance-(One parent class and one child class)
        2) Multilevel Inheritance-(combining multiple single inheritance)
        3) Hierarchical Inheritance-(One parent class with multiple child but each child has no relation between them)
        4) Multiple Inheritance
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

