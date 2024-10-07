package Day9;

public class StudentMain {
    public static void main(String[] args){

        //Creating an object with reference variable
        /*
        Student stu = new Student();
        stu.sid = 1010;
        stu.sname = "Sumit";
        stu.grade = 'A';

        stu.printStudentData();
         */

        //creating an object without reference variable
        new Student();

        // Here every time new object is created
        new Student().sid =102; // we can use it one time
        new Student().sname = "Sanju";
        new Student().grade = 'B';
        new Student().printStudentData();
    }
}
