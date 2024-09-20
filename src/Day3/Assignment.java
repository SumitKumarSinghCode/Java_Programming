package Day3;

public class Assignment {
    public static void main(String[] args){
        //Swapping Two Numbers
        int num1 = 10, num2=20;
        System.out.println("Numbers before swaping: "+num1+" "+num2);
        num1 =num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Numbers after swaping: "+num1+" "+num2);
    }
}

