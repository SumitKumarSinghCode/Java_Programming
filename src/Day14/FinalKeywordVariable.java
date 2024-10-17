package Day14;

// When a variable is declared as final, its value cannot be changed once it is assigned.
// A final variable must be initialized at the time of declaration or in the constructor.

class Test{
    final int x = 100;
    
}

public class FinalKeywordVariable {
    public static void main(String[] args){
        Test t = new Test();
        System.out.println(t.x);
        // t.x=200; we cannot change value of the final variable
    }
}
