package Day1;

import java.util.Scanner;

public class FirstJavaProgram {
    public static void main(String[] args) {
        //Output
        System.out.println("Hello"); //Hello
        System.out.println(10+2); //12
        System.out.println(1+"Hello"); //1Hello

        //Type Casting int to long can be done implicitly
        int x = 1000;
        long y = x;
        System.out.println(y); //1000

        //Type casting long into int can be done explicitly
        long a = 10000;
        int b = (int)a;
        System.out.println(b); //10000

        //Type casting form long to int if the number is more than 10 pow 9 it will give different value
        long A = 10000000000l;
        int B = (int)A;
        System.out.println(B); //1410065408(different value)

        //Reading Input
        /*
        Scanner Scn = new Scanner(System.in);
        int first = Scn.nextInt();
        int second = Scn.nextInt();
        System.out.println(first);
        System.out.println(second);
         */

        //Float
        float f = 1.1052424f;
        System.out.println(f); //1.1052424

        //Double
        double d = 1.45;
        System.out.println(d); //1.45

        //Type casting float to double will be done implicitly
        double type_casting_float_to_double = f;
        System.out.println(type_casting_float_to_double); //1.105242371559143

        //Type casting double to float can be done explicitly
        float type_casting_double_to_float = (float)d;
        System.out.println(type_casting_double_to_float); //1.45


    }
}