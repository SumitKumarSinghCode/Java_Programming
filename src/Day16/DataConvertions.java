package Day16;

public class DataConvertions {
    public static void main(String[] args){
        // Scenario -1 ( String --> int, double, bool, char(not possible))  (Unboxing)

        // String to int
        // String s = "Welcome"; // cannot convert to number
        String s1 ="10";
        String s2 ="20";
        int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
        System.out.println(sum); //30

        // String to double
        String s3 ="10.5";
        String s4="10.0";
        double dsum = Double.parseDouble(s3)+Double.parseDouble(s4);
        System.out.println(dsum); // 20.5

        // String to boolean
        String s5="TRUE"; // string can be in any case
        boolean blvalue = Boolean.parseBoolean(s5);
        System.out.println(blvalue); // true

        // String to char ( cannot convert to char because multiple character cannot be converted to single character )
        // String s ="welcome"; // cannot convert to char(Not possible)


        System.out.println();
        // Scenario -2 (int, double, bool, char --> String) (Auto Boxing)
        int x=100;
        String xstring = String.valueOf(x);
        System.out.println(xstring); // 100

        double d = 10.5;
        String dstring= String.valueOf(d);
        System.out.println(dstring); // 10.5

        boolean b = true;
        String bstring = String.valueOf(b);
        System.out.println(bstring); // true

        char c ='A';
        String cstring = String.valueOf(c);
        System.out.println(cstring); // A


        System.out.println();
        // Scenario -3 (int to double)
        int num =10;
        // Approach-1
        double dbl =num;
        // Approach-2
        double dvalue =Double.valueOf(num);

        System.out.println(dvalue+" "+dbl); // 10.0 10.0


        System.out.println();
        // Scenario -4 (double to int) we don't convert because decimal point will be missing
        double y = 10.5;
        // int z = y; // Not possible
         int z = (int)y; // By type casting we can do it
        System.out.println(z); // 10
    }
}
