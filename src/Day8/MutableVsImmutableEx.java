package Day8;

import java.util.Arrays;

public class MutableVsImmutableEx {
    public static void main(String[] args){

        // Mutable Vs Immutable Exercise
        int[] a = {20,30,40,50,10};
        int[] b = a; // we use cone() method instead of it to make a copy.
        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(a)); // [20, 30, 40, 50, 10]

        Arrays.sort(a); // Mutable(can change)
        System.out.println("Array after sorting");
        System.out.println(Arrays.toString(a)); // [10, 20, 30, 40, 50]
        System.out.println(Arrays.toString(b)); // [10, 20, 30, 40, 50]

    }
}
