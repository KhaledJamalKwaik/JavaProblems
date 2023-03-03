package P11_8;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    private int id;     // default 0
    private double balance;     // default 0
    private static double annualInterestRate;   // default 0
    private Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    // A no-arg constructor that creates a default account
    public Account() {
    }

    // A constructor that creates an account with the specified name, id, and balance.
    public Account(int id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    // A constructor that creates an account with the specified id and initial balance
    public Account(int id, double initialBalance) {
        this.id = id;
        balance = initialBalance;
        dateCreated = new Date();
    }

    // A method that changes the account id
    public void setId(int id) {
        this.id = id;
    }

    // A method that returns the account id
    public int getId() {
        return id;
    }

    // A method that returns the balance
    public double getBalance() {
        return balance;
    }

    // A method that returns the AnnualInterestRate
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // A method that changes the balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // A method that changes the AnnualInterestRate
    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    // A method that returns the DateCreated
    public Date getDateCreated() {
        return dateCreated;
    }
    
    // A method that returns the MonthlyInterestRate
    public static double getMonthlyInterestRate() {
        return annualInterestRate / 1200;
    }

    // A method that returns the MonthlyInterest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // A method that withdraws a specified amount from the account
    public void withdraw(double withdraw) {
        balance -= withdraw;
        transactions.add(new Transaction('W', withdraw, balance, String.format("Withdraw", withdraw)));
    }

    // A method that deposits a specified amount to the account
    public void deposit(double deposit) {
        balance += deposit;
        transactions.add(new Transaction('D', deposit, balance, String.format("Deposit %f$", deposit)));
    }
}