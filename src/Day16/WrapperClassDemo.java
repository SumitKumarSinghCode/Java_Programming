package Day16;

// A wrapper class in Java is an object representation of a primitive data type.
/*
Primitive Type	       Wrapper Class
 int	                  Integer
 char	                 Character
 float	                 Float
 double	                 Double
 long	                 Long
 short	                 Short
 byte	                 Byte
 boolean	             Boolean
 */

public class WrapperClassDemo {
    public static void main(String[] args){

        // Primitive type
        int i =10;
        double d = 10.5;
        char c ='A';
        boolean b =true;

        // converting primitive type to object type -- (we also say Auto boxing concepts)
        Integer iobj=i;
        Double dobj=d;
        Character cobj=c;
        Boolean bobj=b;

        // Printing object type
        System.out.println(iobj); // 10
        System.out.println(dobj); // 10.5
        System.out.println(cobj); // A
        System.out.println(bobj); // true

        // converting Object type to primitive type -- (we also say unboxing concepts)
        int intvalue = iobj;
        double doublevalue = dobj;
        char charvalue = cobj;
        boolean boolvalue = bobj;

        // Printing primitive type
        System.out.println(intvalue); // 10
        System.out.println(doublevalue); // 10.5
        System.out.println(charvalue); // A
        System.out.println(boolvalue); // true

    }
}
