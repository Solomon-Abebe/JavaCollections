package Classes.Transaction;

import Classes.Account.Account;
import Classes.Client.Client;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


    ArrayList<Account>accounts= new ArrayList<>();
    Client client = new Client(100, "Solomon","0912303082");

    accounts.add(new Account(1,2000, 7.5, client));
    accounts.add(new Account(2,5000,7.5, client));

    accounts.get(0).deposit(10000);
    accounts.get(0).withdraw(2000);
    accounts.get(0).withdraw(1000);
    accounts.get(0).withdraw(100);
    accounts.get(0).deposit(1000);

    accounts.get(1).withdraw(500);
    accounts.get(1).withdraw(1000);
    accounts.get(1).deposit(5000);

    for(Account account:accounts){
        System.out.println("Account"+ account.getId() +" :");
        System.out.println("W : "+ account.countTransaction('W'));
        System.out.println("D : "+ account.countTransaction('D'));
    }


   }
}
