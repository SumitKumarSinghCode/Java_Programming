package Day7;

public class Assignment2 {
    public static void main(String[] args) {
        // Find Missing Number in an array.
        // Numbers should be in range and it should not have duplicate elements.
        int[] arr = {1,2,3,5};
        int current_sum = 0;
        int sum_of_range=0;

        for(int i=1;i<=5;i++)
        {
            sum_of_range+=i;
        }

        for(int i=0;i<arr.length;i++)
        {
            current_sum+=arr[i];
        }

        System.out.println("Missing number in an array is : "+(sum_of_range-current_sum));
    }
}
