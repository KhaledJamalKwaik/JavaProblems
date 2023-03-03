package P11_8;

public class Main {

    public static void main(String[] args) {
        
        Account account = new Account(1122, 1000, "George");
        Account.setAnnualInterestRate(1.5);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.printf("Holder Name: %s\nInterest Rate: %.2f\nBalance: %.2f\n\nTransactions: %s", 
        account.getName(), Account.getAnnualInterestRate(), account.getBalance(), account.getTransactions().toString());

    }
    

}
