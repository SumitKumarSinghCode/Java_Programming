package Day11;

public class CallByValue {
    public static void main(String[] args)
    {
        Test test = new Test();

        test.number = 100;
        System.out.println("Before method:"+test.number); //100

        test.m2(test); //110
        System.out.println("After method:"+test.number); // 110

    }
}
