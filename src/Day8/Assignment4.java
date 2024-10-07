package Day8;

public class Assignment4 {
    public static void main(String[] args){
        // Count occurrences of 'l' character in String

        String s = "Hello";
        char[] arr = s.toCharArray();
        int count_l = 0;

        for(char c:arr){
            if (c=='l'){
                count_l++;
            }
            }
        if(count_l>0)
        {
        System.out.println("count of 'l' in string: "+count_l);
        }
        else
        {
            System.out.println("Not found");
        }
    }
}
