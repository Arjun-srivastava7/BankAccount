public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        System.out.println("Initial Balance: ₹" + account.getBalance());

        // Deposit
        account.deposit(500);
        System.out.println("After Deposit: ₹" + account.getBalance());

        // Successful withdrawal
        try {
            account.withdraw(300);
            System.out.println("After Withdrawal: ₹" + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        // Withdrawal with insufficient funds
        try {
            account.withdraw(1500);
        } catch (InsufficientFundsException e) {
            System.out.println("\nWithdrawal Failed: " + e.getMessage());
        }

        // Print transactions
        account.printTransactions();
    }
}