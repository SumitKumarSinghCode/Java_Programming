package Day3;

public class IncrementOperators {
    public static void main(String[] agrs){
        // ++ is called Increment Operator
        int a  = 10;
        System.out.println(a); //10
        a++;
        System.out.println(a); //11

        //Case-1 Post Increment
        System.out.println("Case-1");
        int num1 = 10;
        int result = num1++; //first value will assign then incrementation will happen
        System.out.println("Value of result is: "+result); //10
        System.out.println("Value of num is: "+num1); //11

        //Case-2 Pre Increment
        System.out.println("Case-2");
        int num2 = 10;
        int res = ++num2; //first incrementation will happen and then the value will assign to res
        System.out.println("Value of res is: "+res); //11
        System.out.println("Value of num2 is: "+num2); //11
    }
}
