package project;
public class BankAccount {
    //private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
       // this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Current Balance: $" + balance);
            return true;
        } else if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
        } else {
            System.out.println("Insufficient balance.");
        }
        return false;
    }
}

