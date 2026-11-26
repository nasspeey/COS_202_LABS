public class BankAccount {
    private String accountNumber;
    private String owner;
    private double balance;

    public BankAccount(String accountNumber, String owner, double openingBalance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = openingBalance < 0 ? 0 : openingBalance;
    }

    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited " + amount);
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal must be positive.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds: cannot withdraw " + amount + " (balance " + balance + ").");
            return false;
        }
        balance -= amount;
        System.out.println("Withdrew " + amount);
        return true;
    }

    @Override
    public String toString() {
        return "Account[" + accountNumber + ", owner=" + owner + ", balance=" + String.format("%.2f", balance) + "]";
    }
}
