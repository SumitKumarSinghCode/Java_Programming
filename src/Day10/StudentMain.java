package Day10;

public class StudentMain {
    public static void main(String[] args){

        /*
        //1)Assigning data using object reference variable
        Student s1 = new Student();
        s1.sid=101;
        s1.sname="Sumit";
        s1.grade='A';
        s1.printStuData(); // 101 Sumit A

        //2)Assigning Data using user defined method
        Student s2 = new Student();
        s2.setStuData(102,"Singham",'B');
        s2.printStuData(); // 102 Singham B
        */

        //3) Assigning Data Using constructor
        Student s3 = new Student(103,"Raj",'C');
        s3.printStuData(); //103 Raj C

    }
}
