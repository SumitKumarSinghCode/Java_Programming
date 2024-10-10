package Day13;

public class MultilevelInheritance{

    public static void main(String[] args){
       C cobj = new C();
       cobj.a=100;
       cobj.b=200;
       cobj.c=300;

       cobj.display(); //100
       cobj.show(); //200
       cobj.print(); //300
    }
}
