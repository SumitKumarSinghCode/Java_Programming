package Day13;

public class SingleInheritance{
    public static void main(String[] args){
        B bobj = new B();
        bobj.a=10;
        bobj.b=20;

        bobj.display(); //10
        bobj.show(); //20
    }
}
