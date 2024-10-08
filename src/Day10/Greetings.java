package Day10;

public class Greetings {
    // Methods

    //1) No parameters   No return value
    void m1(){
        System.out.println("Hello...");
    }

    //2) No parameters  return value
    String m2(){
        return "Hello how are you";
    }

    //3) parameters   No return value
    void m3(String name){
        System.out.println("Hello "+name);
    }

    //4) Takes parameters   Return value
    String m4(String name){
        return("Hello "+name);
    }


}
