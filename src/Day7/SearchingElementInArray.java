package Day7;

public class SearchingElementInArray {
    public static void main(String[] args){
        //Searching Element in an array. Example:- Input = [1,2,3,4] find 3 Output = 3 is available
        int arr[] = {1,2,3,4,5};
        int seach_element = 3;
        boolean status = false; // false(Not found)  true(found)
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==seach_element)
            {
                System.out.println(arr[i]+" Element found");
                status = true;
                break;
            }
            }
        if (status == false)
        {
            System.out.println("Element not found");
        }

        }
    }
