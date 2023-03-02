package P11_3;

public class CheckingAccount extends Account {
    
    private final double limit = -500;

    public CheckingAccount() {
    }

    public CheckingAccount(int id, double initialBalance) {
        super(id, initialBalance);
    }

    @Override
    public void withdraw(double amount) {

        if (this.getBalance() - amount < limit)
            System.out.println("Sorry, you will exceed the withdraw limit.");
        else 
            this.setBalance(this.getBalance() - amount);
        
    }

    @Override
    public String toString() {

        return super.toString() + "\nOverdraft protection up to : $" + limit;

    }
}