package Day11;

public class AdderMain {
    public static void main(String[] args) {

        Adder ad = new Adder();
        ad.sum(); // it will call method 1 (Output-30)
        ad.sum(10.5, 10); //it will call method 5 (Output-20.5)
        ad.sum(10, 10.5); //it will call method 4 (Output-20.5)
        ad.sum(10.5,10.5); //it will call method 3 (Output-21.0)
        ad.sum(20,30);//it will call method 2 (Output-50)
    }
}
