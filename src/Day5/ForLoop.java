package Day5;

public class ForLoop {
    public static void main(String[] args){
        //Print number from 1 to 10
        for (int i=1;i<=10;i++)
        {
           System.out.println(i);
        }


        //Print number from 10 to 1
        for (int j=10; j>=1;j--)
        {
            System.out.println(j);
        }

        //from 1-10 specify each number is even/odd
        for(int start=1; start<=10;start++) {
           if(start%2==0){
               System.out.println(start+" Even");
           }else{
               System.out.println(start+" Odd");
           }
        }

    }
}
