package Day5;

public class Assignment7 {
    public static void main(String[] args){
        // Print All the prime numbers from 1 to 100

        for(int n=0; n<=100; n++)
        {
            int count =0;
            if(n>1)
            {
                for(int i=1; i<=n; i++)
                {
                    if(n%i==0)
                    {
                        count++;
                    }
                }
                if(count==2)
                {
                    System.out.println(n);
                }
            }
        }
    }
}
