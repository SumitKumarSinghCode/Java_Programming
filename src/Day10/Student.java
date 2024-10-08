package Day10;

public class Student {
     int sid;
     String sname;
     char grade;

     void printStuData(){
         System.out.println(sid+" "+sname+" "+grade);
     }

     void setStuData(int id,String name,char g){
         sid=id;
         sname=name;
         grade=g;
     }

     /* Declaring constructor
    constructor name should be same as class name */
    Student(int id,String name,char g){
        sid=id;
        sname=name;
        grade=g;
    }

}
