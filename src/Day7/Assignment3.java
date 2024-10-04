package Day7;

public class Assignment3 {
    public static void main(String[] args){
        // Find the smallest element in an array.

        int arr[] = {100,200,800,500,50,9};
        int smallest = arr[0];

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        System.out.println("smallest element in an array is:"+smallest);
    }
}
