package Day10;

public class GreetingsMain {
    public static void main(String[] args){
        Greetings gr = new Greetings(); //Created gr object

        gr.m1(); // Hello...

        String s1 = gr.m2();
        System.out.println(s1); //Hello how are you

        gr.m3("Sumit"); //Hello Sumit

        String s2 = gr.m4("Singham");
        System.out.println(s2); // Hello Singham
    }
}
