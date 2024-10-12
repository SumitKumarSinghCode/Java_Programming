package Important_Coding_Problems;

public class Assignment1 {
    public static void main(String[] args){
        // Write a program to find duplicate characters in a given String.

        String s = "Welcome".toLowerCase(); // converted string to lower case
        char[] character = s.toCharArray(); // created char type array and stored each character of the string

        boolean isNotDuplicate = false; // initialized isNotDuplicate for tracking

        for(int i=0; i<s.length(); i++)
        {
            boolean isDuplicate = false;

            for(int j=(i+1); j<s.length(); j++)
            {
                if(character[i] == character[j])
                {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate)
            {
                System.out.println(character[i]);
                isNotDuplicate = true;
            }
        }

        if(!isNotDuplicate)
        {
            System.out.println("No Duplicate found!");
        }
    }
}
