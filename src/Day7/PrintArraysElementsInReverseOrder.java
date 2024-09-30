package Day7;

public class PrintArraysElementsInReverseOrder {
    public static void main(String[] args){
        // Print Arrays Elements In Reverse Order
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Array elements before....");
        for(int i=arr.length-1; i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
