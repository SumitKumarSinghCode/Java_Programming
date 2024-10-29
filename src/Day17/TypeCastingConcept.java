package Day17;

/*
 Upcasting-> converting value from smaller to larger.(automatic process)
 int --> long
 float --> double

 Down casting-> converting value from larger to smaller.(manually we have to do it)
 long--> int
 double--> float
*/

public class TypeCastingConcept {
    public static void main(String[] args){

        // Upcasting - automatic --small to large
        int intvalue=100;
        long longvalue=intvalue;
        System.out.println(longvalue); // 100

        float floatvalue=10.5F;
        double doublevalue=floatvalue;
        System.out.println(doublevalue); // 10.5

        // Down casting -manually -- larger to smaller
        long l=10000;
        int i=(int)l;
        System.out.println(i); //10000

        double d=10.5d;
        float f=(float)d;
        System.out.println(f); //10.5
    }
}
