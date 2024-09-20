package Day2;

public class DataType {
    public static void main(String[] args){
        //Numeric Data Types
        int a = 100, b = 200;
        System.out.println("The Value of a is:"+a);
        System.out.println("The Value of b is:"+b);
        System.out.println("The sum of a and b is:"+(a+b));

        byte by = 125;
        System.out.println(by);

        short sh = 3535;
        System.out.println(sh);

        long l = 10000000000L; //Literal is needed l/L
        System.out.println(l);

        //Decimal Numbers - Float, Double
        float item_price = 15.5F; //Literal is needed f/F
        System.out.println(item_price);

        double dbl = 1234.4343412;
        System.out.println(dbl);

        //Character Data Type
        char grade = 'A'; //One single character is allowed and should be placed inside single quote
        System.out.println(grade);

        //String Data Type
        String name = "Sumit"; //Multiple character can be stored and should be placed inside double quote
        System.out.println(name);

        //char ch = 'ABC'; //Invalid
        //String str = 'ABC'; //Invalid
        //String str = 'A'; //Invalid
        //String str = "A"; //Valid

        //Boolean Data Type
        boolean bl = true; //Always Only true / false
        System.out.println(bl);

        //boolean bool = True; //Invalid
        //boolean bool = False; //Invalid
        //boolean bool = "true"; //Invalid
        //boolean bool = "false"; //Invalid

        boolean bul = false; //Always Only true / false without any quote
        System.out.println(bul);
    }
}
