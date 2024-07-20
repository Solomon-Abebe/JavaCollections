package Classes.Account;

import Classes.Client.Client;
import Classes.Client.Transaction;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;

    private Client client;
    private ArrayList<Transaction> transactions;

    private final Date dateCreated;

    public Account(int id, double balance, double annualInterestRate, Client client){

        this.id = id;
        this.balance =balance;
        this.annualInterestRate = annualInterestRate;

        this.client = client;
        this.transactions = new ArrayList<>();

        this.dateCreated = new Date();
       // dateCreated = new Date();

    }
    public void deposit(double amount){
        balance += amount;
        this.transactions.add(new Transaction('D', amount, this.balance, "Deposited"+amount));
    }
    public boolean withdraw(double amount){
        if (balance<amount) return false;

        balance -= amount;
        this.transactions.add(new Transaction('W',amount, this.balance, "Withdrawn"+amount));

        return true;
    }
    public int countTransaction(char Type){
        int count=0;
        for (Transaction transaction:transactions)
            if (transaction.getType() == Type)
                count++;
        return count;

    }

    public int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance(){

        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String toString(){
        return this.id + " " + this.balance + " " + this.annualInterestRate + " " + this.dateCreated;
    }

}
