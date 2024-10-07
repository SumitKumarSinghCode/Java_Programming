package Day9;

public class Employee {

    int eid;
    String ename;
    String job;
    int sal;

    void display()
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(sal);
    }

    /*
    public static void main(String[] args){
        //Objects should be created only in main method(because execution will start form main method)

        Employee emp1 = new Employee();
        emp1.eid = 101;
        emp1.ename = "Sumit";
        emp1.job = "Manager";
        emp1.sal = 50000;
        emp1.display();

        Employee emp2 = new Employee();
        emp2.eid = 102;
        emp2.ename = "Sonu";
        emp2.job = "Engineer";
        emp2.sal = 60000;
        emp2.display();
    }
     */
}
