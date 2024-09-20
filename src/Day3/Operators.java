package Day3;

public class Operators {
    public static void main(String[] args){

        //Arithmetic operators + - * / %
        int num1 = 10 , num2 = 20;
        int add = num1 + num2;
        int sub = num2 - num1;
        int mul = num1 * num2;
        int div = num2/num1;
        int mod = num2%num1;
        System.out.println("Result of Sum of num1+num2 is:"+add);
        System.out.println("Result of Sub of num2-num1 is:"+sub);
        System.out.println("Result of Multiple of num2 with num1 is:"+mul);
        System.out.println("Result of Division of num2 by num1 is:"+div);
        System.out.println("Result of modulus of num2 by num1 is:"+mod);

        //Relational/Comparison operators > >= < <= != == Always returns a boolean value-true/false
        System.out.println(num1 > num2); //false
        System.out.println(num1 < num2); //true
        System.out.println(num1 >= num2); //false
        System.out.println(num1 <= num2); //true
        System.out.println(num1 != num2); //true
        System.out.println(num1 == num2); //false

        //Logical Operators && || ! Returns Boolean value- true/false
        //  x y  x&&y  x||y  !x !y
        //  T T   T     T    F  F
        //  T F   F     T    F  T
        //  F T   F     T    T  F
        //  F F   F     F    T  T

        boolean val1 = true;
        boolean val2 = false;
        boolean and_result = val1 && val2; //false
        System.out.println("Result of val1 AND val2 is: "+and_result);

        boolean or_result = val1 || val2; //true
        System.out.println("Result of val1 OR val2 is: "+or_result);

        boolean not_result = !(val1); //false
        System.out.println("Result of not val1: "+not_result);





    }
}
