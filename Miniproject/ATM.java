package Miniproject;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Welcome to the ATM Interface");

        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();
        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        if (!bank.isValidUser(userId, pin)) {
            System.out.println("Invalid credentials. Exiting.");
            return;
        }

        AccountHolder holder = bank.getAccountHolder(userId);
        Account account = bank.getAccount(userId);
        BankTransaction transaction = new BankTransaction(holder, account);

        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. View Transaction History");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Check Balance");
            System.out.println("6. Quit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    transaction.showHistory();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    transaction.deposite(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    if (!transaction.withdraw(sc.nextDouble()))
                        System.out.println("Insufficient balance.");
                    break;
                case 4:
                    System.out.print("Enter recipient user ID: ");   
                    sc.nextLine();
                    String toUserId = sc.nextLine();
                    Account toAccount = bank.getAccount(toUserId);
                    if (toAccount == null) {
                        System.out.println("Invalid user ID.");
                        break;
                    }
                    System.out.print("Enter amount to transfer: ");
                    if (!transaction.transfer(toAccount, sc.nextDouble()))
                        System.out.println("Transfer failed. Insufficient balance.");
                    break;
                case 5:
                    System.out.println("Current Balance: ₹" + transaction.getBalance());
                    break;
                case 6:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
}