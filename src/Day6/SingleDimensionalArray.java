package Day6;

public class SingleDimensionalArray {
    public static void main(String[] args){
        //Single Dimensional Array

        // Approach:-1) size will be fixed once declared.
        int a[] = new int[5]; //Declaring Array

        //Adding Values into an Array.
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;

        // Approach:-2) we can add n numbers of values
        int b[] = {100,200,300,400,500,600}; //Declaring Array and Adding Values into an Array.
        int c[] = {}; //Array is created but length will be zero, because it has no value.

        //Find length of an array
        System.out.println("Length of an array: "+a.length); //5
        System.out.println("Length of an array: "+b.length); //6

        // Read single values of an array.
        System.out.println(a[4]); //here 4 is index number

        // Reading all values of an array using normal for loop
        for (int i = 0; i<(a.length);i++){
            System.out.println(a[i]); //100  200  300  400  500
        }

        // Reading all values of an array using enhanced for loop
        for(int x:a){ //here each value of array a will be assigned one after another to x variable.
            System.out.println(x); //100  200  300  400  500
        }

    }
}
