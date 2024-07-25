package project;

import java.util.Scanner;

public class ATM {
    private BankAccount bankAccount;
    private Scanner scanner;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("\nATM Machine");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private void checkBalance() {
        double balance = bankAccount.getBalance();
        System.out.println("Current Balance: $" + balance);
    }

    private void deposit() {
        System.out.print("Enter deposit amount: $");
        double amount = scanner.nextDouble();
        bankAccount.deposit(amount);
    }

    private void withdraw() {
        System.out.print("Enter withdraw amount: $");
        double amount = scanner.nextDouble();
        boolean success = bankAccount.withdraw(amount);
        if (!success) {
            System.out.println("Transaction failed. Please try again.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0); // Example account initialization
        ATM atm = new ATM(account);
        atm.run();
    }
}
