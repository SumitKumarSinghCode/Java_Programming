package Day15;

public class MultipleInheritance implements I1,I2 {
    public void m1() {
        System.out.println("This is m1...");
    }

    public void m2() {
        System.out.println("This is m2...");
    }

    public static void main(String[] args) {
        MultipleInheritance mi = new MultipleInheritance();
        mi.m1(); // This is m1...
        mi.m2(); // This is m2...

        System.out.println(mi.x + " " + mi.y); // 100 200

    }
}