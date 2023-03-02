package P11_3;

public class SavingsAccount extends Account {
    
    private final double limit = 0;

    public SavingsAccount() {
    }

    public SavingsAccount(int id, double initialBalance) {
        super(id, initialBalance);
    }

    @Override
    public void withdraw(double amount) {

        if (this.getBalance() - amount < limit)
            System.out.println("Sorry, You will exceed the withdraw limit.");
        else
            this.setBalance(this.getBalance() - amount);
        
    }

    @Override
    public String toString() {
        return super.toString() + "\nSavings account cannot be overdrawn";
    }


}
