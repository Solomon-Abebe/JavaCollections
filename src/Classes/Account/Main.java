package Classes.Account;


import Classes.Client.Client;

public class Main {
    public static void main(String[] args) {

        Account testAccount = new Account(1122, 20000,4.5, new Client(1122, "Solomon","0912303082"));

        if(testAccount.withdraw(2000))
            System.out.println("Withdraw successful");
        else
            System.out.println("Withdraw not successful");

        testAccount.deposit(3000);
        System.out.println("The Account information after transaction is: "+ '\n'+
                " Id: "+ testAccount.getId()+ '\n'+
                " Balance: "+testAccount.getBalance() + '\n'+
                " AnnualInterestRate: "+ testAccount.getAnnualInterestRate() +'\n'+
                " Date Created: "+ testAccount.getDateCreated());

        System.out.println("After Deposit:");
           testAccount.deposit(6000);
           testAccount.setId(1122);
           testAccount.setAnnualInterestRate(5.3);

        System.out.println("The Account information after transaction is: "+ '\n'+
                " Id: "+ testAccount.getId()+ '\n'+
                " Balance: "+testAccount.getBalance() + '\n'+
                " AnnualInterestRate: "+ testAccount.getAnnualInterestRate() +'\n'+
                " Date Created: "+ testAccount.getDateCreated());
    }
}
