package Day3;

public class DecrementOperator {
    public static void main(String[] args){
        // -- DecrementOperator
        int a = 10;
        System.out.println(a); //10
        a--;
        System.out.println(a); //9

        //Case-1 Post Decrement Operator
        System.out.println("Case-1 Post Decrement Operator");
        int num1 = 10;
        int res = num1--; //first value will assign an Decrementation will happen
        System.out.println("Value of res is: "+res); //10
        System.out.println("Vlaue of num is: "+num1); //9

        //Case-2 Pre Decrement Operator
        System.out.println("Case-2 Pre Decrement Operator");
        int num2 = 10;
        int result = --num2; //fiest decrement will happen and then value will be assigned
        System.out.println("Value of result is: "+result); //9
        System.out.println("Value of num2 is: "+num2); //9

    }
}
