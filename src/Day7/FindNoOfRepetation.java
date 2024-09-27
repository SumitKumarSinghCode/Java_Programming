package Day7;

public class FindNoOfRepetation {
    public static void main(String[] args){
        //Find number of repetations
        int arr[] = {10,20,30,40,10,50,60,70,80,90,100,10};
        int search_element = 10;
        int count = 0;

        for(int x:arr){
            if(x == search_element){
                count++;
            }
        }
        System.out.println("Total count of "+search_element+" in an array is "+ count);
    }
}
