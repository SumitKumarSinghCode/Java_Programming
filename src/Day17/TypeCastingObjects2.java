package Day17;

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}

public class TypeCastingObjects2 {
    public static void main(String[] args){
        //Rule 1 : check conversion is valid or not
        // The type of 'd'(an) and 'C'(Cat) must have some relationship (either parent child or child parent)
        //Animal an=new Dog();
        // Cat ct = (Cat)an; // Invalid as per Rule 1.

        //Rule 2: Assignment is valid or not
        // 'C'(Cat) must be either same or Child of 'A'(Cat)
        //Animal an=new Dog();
        //Cat ct = (Cat)an; // Valid as per Rule 2.

        //Rule 3: (The underlying object type of 'd') Dog must be either same or child of 'C'(Cat).
        //Animal an=new Dog();
        //Cat dg=(Cat)an; //Invalid as per Rule no 3.

        //Rule 1, Rule 2, Rule 3
        Animal an=new Dog();
        //Dog dg=(Dog)an; //Rule 1:-valid ,Rule 2:-valid, Rule 3:-valid

        Animal dg=(Dog)an; //Rule 1:-valid ,Rule 2:-valid, Rule 3:-valid

    }
}
