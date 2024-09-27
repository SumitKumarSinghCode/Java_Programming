package Day6;

public class TwoDimensionalArray {
    public static void main(String[] args){
        // Two Dimensional Array / Multi Dimensional Array

        // Approach:-1)
        int a[][] = new int[3][2]; //Declaring two Dimensional array of fix size.
        //int [][]a = new int[3][2]; this is also valid
        //int []a[] = new int[3][2]; this is also valid

        //Adding Values in two Dimensional array
        a[0][0] = 100;
        a[0][1] = 200;

        a[1][0] = 300;
        a[1][1] = 400;

        a[2][0] = 500;
        a[2][1] = 600;

        // Approach:-1)
        int b[][] = { {100,200},
                      {300,400},
                      {500,600}, };

        //Find size of an array
        System.out.println("Length of rows:"+a.length);
        System.out.println("Length of columns:"+a[0].length); // 0 is row number

        //Read single value from an array
        System.out.println("First value of an array:"+a[2][1]); // 600

        // Reading all values of an array using normal for loop
        for(int r=0;r<(a.length);r++){ //Here a.length will give rows length(size).
            for(int c=0;c<(a[r].length);c++){ //Here a[0].length will give column length(size).
                System.out.print(a[r][c]+" "); // r-(Row)  c-(Column)
                // 100 200 300 400 500 600
            }
            System.out.println();
        }

        //Read all value from an array using enhanced for loop
        for (int r = 0; r<a.length;r++){
            for(int x:a[r]){
                System.out.print(x+" "); // 100 200 300 400 500 600
            }
            System.out.println(); //New Line
        }

    }
}
