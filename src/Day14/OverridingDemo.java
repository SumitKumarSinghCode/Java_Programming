package Day14;
// Method Overriding(Signature of the method should be same but body of the method is different)

class Bank
{
    double roi()
    {
        return 0;
    }
}

class ICICI extends Bank
{
    double roi()
    {
        return 10.5;
    }
}

class SBI extends Bank{
   double roi(){
        return 11.5;
    }
}

public class OverridingDemo {
    public static void main(String args[]){
        Bank bank = new Bank();
        double roi = bank.roi();
        System.out.println(roi); //0.0

        ICICI icici = new ICICI();
        System.out.println(icici.roi()); //10.5

        SBI sbi = new SBI();
        System.out.println(sbi.roi()); //11.5
    }
}
