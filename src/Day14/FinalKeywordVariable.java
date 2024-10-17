package Day14;

// when we create a variable as a final or make a variable as a final, we cannot change the value of it(Constant)
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
