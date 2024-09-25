package Day5;

public class DoWhileLoop {
    public static void main(String[] args){
        //Print 1 to 10 numbers
        int i = 1; //Initialization
        do{
            System.out.println(i);
            i++;
        }while(i<=10); //Condition


        //Print 10 to 1
        int start = 10;
        do{
            System.out.println(start);
            start--;
        }while(start>=1);
    }
}
