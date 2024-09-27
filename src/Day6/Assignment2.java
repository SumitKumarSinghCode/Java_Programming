package Day6;

public class Assignment2 {
    public static void main(String[] args){
        //Print count of Even or Odd numbers from an array Example:- Input= [1,2,3,4,5,6] Output= Even= 3 Odd= 3
        int arr[] = {1,2,3,4,5,6,7};
        int even = 0;
        int odd = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even= "+even);
        System.out.println("Odd= "+odd);
    }
}
