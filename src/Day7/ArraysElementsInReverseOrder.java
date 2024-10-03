package Day7;

import java.util.Arrays;

public class ArraysElementsInReverseOrder {
    public static void main(String[] args){
        // Print Array Elements In Reverse Order
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array elements before....");
        System.out.println(Arrays.toString(arr));
        System.out.println("Arrays Elements In Reverse Order...");
        for(int i=arr.length-1; i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
