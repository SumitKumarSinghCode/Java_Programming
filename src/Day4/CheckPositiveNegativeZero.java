package Day4;

import java.util.Scanner;

public class CheckPositiveNegativeZero {
    public static void main(String[] args) {
        //Check the number is Positive/Negative/Zero
        Scanner skan = new Scanner(System.in);
        System.out.print("Enter a number to check wether it is Positive/Negative/Zero: ");
        int num = skan.nextInt();
        if (num > 0) {
            System.out.println("Positive Number");
        } else if (num < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }
    }
}
