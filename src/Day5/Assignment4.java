package Day5;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] arg){
        //Count number of even and odd digits in a number example:- Input= 23456 Output= 3 even 2 odd

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scn.nextInt();
        int digit =0;
        int even = 0;
        int odd =0;
        while(number!=0){
            digit = digit*10+(number%10);
            if(digit%2==0){
                even++;
            }else{
                odd++;
            }
            number /=10;
        }
        System.out.println(even+" Even"+" "+odd+" Odd");
    }
}
