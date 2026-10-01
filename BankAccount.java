import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private double balance;
    private final List<String> transactions;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }

        balance = initialBalance;
        transactions = new ArrayList<>();

        transactions.add("Account opened with balance: ₹" + initialBalance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }

        balance += amount;
        transactions.add("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }

        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Insufficient funds. Available balance: ₹" + balance
            );
        }

        balance -= amount;
        transactions.add("Withdrawn: ₹" + amount);
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactions() {
        System.out.println("\nTransaction History:");

        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}