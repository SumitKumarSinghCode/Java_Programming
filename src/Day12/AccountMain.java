package Day12;

public class AccountMain {
    public static void main(String[] args){

        Account ac = new Account();

        //setting values in the Account class using setter method
        ac.setAccno(5975001500002008L);
        ac.setName("Sumit Kumar Singh");
        ac.setBalance(50000);

        //getting the value from Account class through get method
        System.out.println(ac.getAccno()); //5975001500002008
        System.out.println(ac.getName()); //Sumit Kumar Singh
        System.out.println(ac.getBalance());//50000.0

    }
}
