package Day4;

import java.util.Scanner;

public class DisplayWeekNames {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Week day.");
        int week_day = scn.nextInt();

        if (week_day==1){
            System.out.println("Monday");
        }else if(week_day==2){
            System.out.println("Tuesday");
        }else if(week_day==3){
            System.out.println("Wednesday");
        }else if(week_day==4){
            System.out.println("Thursday");
        }else if(week_day==5){
            System.out.println("Friday");
        }else if(week_day==6){
            System.out.println("Saturday");
        }else if(week_day==7){
            System.out.println("Sunday");
        }else{
            System.out.println("Enter a valid week day");
        }

    }
}
