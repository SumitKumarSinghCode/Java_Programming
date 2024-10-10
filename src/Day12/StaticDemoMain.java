package Day12;

public class StaticDemoMain {
    //main method outside class
    public static void main(String[] args){
        /*when we have to use static variable and static method outside the class
        we can call though class_name.static_variable_name/static_method_name
         */
        // for static variable and method
        System.out.println(StaticDemo.a); // 10
        StaticDemo.m1(); //This is m1 Static Method

        //for non-static variable and method we have to create object first
        StaticDemo sd = new StaticDemo();
        System.out.println(sd.b); // 20
        sd.m2(); // This is m2 Nonstatic Method

    }
}
