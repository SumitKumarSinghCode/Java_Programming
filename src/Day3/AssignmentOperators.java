package Day3;

public class AssignmentOperators {
    public static void main(String[] args){
        //Assignment Operators  =  +=  -=  *= /=  %=
        int a = 10;
        a +=5; // a = a+5 first 5 will be added to a and then assigned to a
        System.out.println("Now the Value of a after addition  is: "+a); //15
        a -=5; //a = a-5 first 5 will be subtracted from a and then assigned to a
        System.out.println("Now the Value of a after substraction is: "+a); //10

        a *=2; //a = a*2
        System.out.println("Now Value of a after multiplication will be "+a); //20

        a /=2; //a = a/2
        System.out.println("Now Value of a after devision will be "+a); //10

        a %=2; //a = a%2
        System.out.println("Now Value of a after modulus will be "+a); //0


    }
}
