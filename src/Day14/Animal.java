package Day14;

// Super keyword will be used to invoke the immediate parent class variable.
// Super keyword will be used to invoke the immediate parent class Method.
// Super keyword will be used to invoke the immediate parent class constructor.

class Animal
{
    String color="White";

    void eat()
    {
        System.out.println("Eating...");
    }

    Animal() //constructor
    {
        System.out.println("This is Animal");
    }
}

class Dog extends Animal
{
    String color="Black"; //Variable Overriding

    void displayColor()
    {
        // By using super keyword we can invoke immediate parent class variable
        System.out.println(super.color);
    }

    void eat() // Method Overriding
    {
        //System.out.println("Eating bread");
        super.eat();
    }

    Dog() //constructor
    {
        super();
        //System.out.println("This is Dog");
    }
}

