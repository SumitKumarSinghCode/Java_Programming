package Day7;

import java.util.Arrays;

public class SortingElementsInArray {
    public static void main(String[] args){
        // Sorting Elements in an array
        int arr[] = {100,80,90,70,50,60,40,20,10,30};
        System.out.println("Before Sorting...");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After Sorting...");
        System.out.println(Arrays.toString(arr));
    }
}
