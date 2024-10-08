package Day11;

public class BoxMain {
    public static void main(String[] args)
    {
        Box b1 = new Box();
        System.out.println(b1.volume()); // it will call method 1 (Output-0.0)

        Box b2 = new Box(10);
        System.out.println(b2.volume()); // it will call method 3 (Output-1000.0)

        Box b3 =new Box(3,3,3);
        System.out.println(b3.volume()); //it will call method 2 (Output-27.0)
    }
}
