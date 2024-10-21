package Day16;

import java.nio.file.FileSystemAlreadyExistsException;

public class DataConvertions {
    public static void main(String[] args){

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
        boolean boolvalue = Boolean.parseBoolean(s5);
        System.out.println(boolvalue); // true

        // String to char ( cannot convert to char because multiple character cannot be converted to single character )
        // String s ="welcome"; // cannot convert to char(Not possible)


    }
}
