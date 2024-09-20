package Day3;

public class TernaryOperator {
    public static void main(String[] args){
        // Ternary Operator  ?:
        //Syntax:-  var = exp ? result1:result2;

        //Example:- 1
        int a = 200 , b = 100;
        int x = (a > b)? a:b; //IF the expression will return true a value will be assigned to x else b value will be assigned.
        System.out.println(x); //200

        //Example:- 2
        int X = (1==1)? 100:200; //This expression will return true, 100 will be assigned to X
        System.out.println(X); //100

        //Example:- 3
        int person_age = 30;
        String res = (person_age>18)? "Eligible":"Not Eligible";
        System.out.println(res);
    }
}
