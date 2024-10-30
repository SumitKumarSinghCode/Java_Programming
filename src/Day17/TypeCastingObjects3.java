package Day17;

//A b=(C)d;

public class TypeCastingObjects3 {
    public static void main(String[] args){

        //Ex:-1
        //Object o =new String("Sumit");
        //StringBuffer sb=(StringBuffer) o; //Rule1:-Pass, Rule2:-Pass, Rule3:-failed

        //Ex:-2
        //String s=new String("Sumit");
        //StringBuffer sb=(StringBuffer) s; //Rule1:-failed

        //Ex:-3
        //Object o=new String("Sumit");
        //StringBuffer sb=(String) o; //Rule1:-Pass, Rule2:-failed

        //Ex:-4
        //String s=new String("Sumit");
        //StringBuffer sb=(String) s; //Rule1:-Pass, Rule2:-failed

        //Ex:-6
        //Object o=new String("Welcome");
        //StringBuffer sb=(StringBuffer) o; //Rule1:-Pass, Rule2:-Pass, Rule3:-failed

        //Ex:-7
        Object o=new String("welcome");
        String s=(String) o; //Rule1:-Pass, Rule2:-Pass, Rule3:-Pass

    }
}
