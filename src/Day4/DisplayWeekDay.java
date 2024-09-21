package Day4;

import java.util.Scanner;

public class DisplayWeekDay {
    public static void main(String[] args){
        //Display Week Day
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the name of the week in lower case.");
        String week_name = scn.next();

        switch (week_name){
            case "sunday": System.out.println("1"); break;
            case "monday": System.out.println("2"); break;
            case "tuesday": System.out.println("3"); break;
            case "wednesday": System.out.println("4"); break;
            case "thursday": System.out.println("5"); break;
            case "friday": System.out.println("6"); break;
            case "saturday": System.out.println("7"); break;
            default: System.out.println("Invalid week name.");
        }
    }
}
