package Day5;

public class ForLoop {
    public static void main(String[] args){
        //Print number from 1 to 10
        for (int i=1;i<=10;i++)
        {
           System.out.println(i);
        }

        //from 1-10 specify each number is even/odd
        for(int start=1; start<=10;start++) {
           if(start%2==0){
               System.out.println(start+" Even");
           }else{
               System.out.println(start+" Odd");
           }
        }

        //print 10-1 in descending order
        for(int str=10; str>=1;str--){
            System.out.println(str);
        }

    }
}
