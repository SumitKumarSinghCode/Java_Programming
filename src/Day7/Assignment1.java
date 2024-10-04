package Day7;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        // Sort Array elements using bubble sort

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size_of_array = scn.nextInt();
        int arr[] = new int[size_of_array];

        for(int i=0; i<size_of_array; i++)
        {
            System.out.println("Enter the "+(i+1)+" element:");
            arr[i] = scn.nextInt();
        }
        System.out.print("Your input array is: "+Arrays.toString(arr));

        // Logic for bubble sort
        for(int j=0;j<size_of_array-1;j++) {
            for (int i = 0; i < size_of_array - 1; i++)
            {
                if (arr[i] > arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("Output: "+Arrays.toString(arr));

    }
}
