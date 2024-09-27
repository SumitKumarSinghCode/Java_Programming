package Day6;

public class Assignment1 {
    public static void main(String[] args){
        //Find sum of elements in an array. Example:- Input= [1,2,3,4,5]  Output= 15
        int arr[] = {1,2,3,4,5};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of all the element in an array is "+sum); //15
    }
}
