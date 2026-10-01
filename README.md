# Bank Account with Exceptions

## Description

This project models a simple bank account using Java.

The account supports:

- Depositing money
- Withdrawing money
- Checking the balance
- Preventing overdrafts
- Handling insufficient funds using a custom exception
- Maintaining and printing a transaction history

## Files

- `BankAccount.java` - Contains the bank account logic.
- `InsufficientFundsException.java` - Custom exception for insufficient funds.
- `Main.java` - Driver program that demonstrates the account.
- `README.md` - Project documentation.

## How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA or another Java IDE.
3. Compile the Java files.
4. Run `Main.java`.

## Example

The program starts with a balance of ₹1000.

It then:
1. Deposits ₹500.
2. Withdraws ₹300 successfully.
3. Attempts to withdraw ₹1500.
4. Rejects the withdrawal because there are insufficient funds.
5. Prints the transaction history.

## Concepts Used

- Classes and objects
- Encapsulation
- Methods
- ArrayList
- Exception handling
- Custom exceptions
- Loops