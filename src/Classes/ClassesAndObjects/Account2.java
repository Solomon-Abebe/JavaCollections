package Classes.ClassesAndObjects;

import java.util.Date;

public class Account2 {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account2(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
    }
    public boolean withdraw(double amount){
        if(amount>balance) return false;
        balance -= amount;
        return true;
    }
    public void deposit(double amount){
        balance +=amount;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate =annualInterestRate;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public static void main(String[] args) {
        Account2 selamAcc = new Account2(11111, 5000, 15);
        Account2 solomonAcc = new Account2(11122, 50000,15);
        System.out.println(solomonAcc.getBalance());
        System.out.println(selamAcc.getId());
        System.out.println(selamAcc.getDateCreated());
        solomonAcc.setAnnualInterestRate(19);
        System.out.println(solomonAcc.getAnnualInterestRate());


    }
}

