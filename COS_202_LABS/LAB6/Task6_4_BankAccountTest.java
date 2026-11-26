public class Task6_4_BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("0123456789", "Anass Haruna", 5000);
        System.out.println("Opened   : " + acc);
        acc.deposit(2500);
        System.out.println("Deposit  : " + acc);
        acc.withdraw(3000);
        System.out.println("Withdraw : " + acc);
        acc.withdraw(10000);
        System.out.println("Overdraft: " + acc);
    }
}
