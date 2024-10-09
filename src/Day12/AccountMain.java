package Day12;

public class AccountMain {
    public static void main(String[] args){

        Account ac = new Account();

        //setting values in the Account class using setter method
        ac.setAccno(5975001500002008l);
        ac.setName("Sumit Kumar Singh");
        ac.setBalance(50000);

        //getting the value from Account class through get method
        System.out.println(ac.getAccno());
        System.out.println(ac.getName());
        System.out.println(ac.getBalance());

    }
}
