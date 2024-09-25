


import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount bankAccount) {
        account = bankAccount;
    }

    public void displayMenu() {
        System.out.println("\n\n1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenu();
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance: Rs. " + account.getBalance());
                    break;
                case 2:
                    System.out.print("\nEnter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("\nDeposit successful. Your balance: Rs. " + account.getBalance());
                    break;
                case 3:
                    System.out.print("\nEnter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("\nWithdrawal successful. Your balance: Rs. " + account.getBalance());
                    } else {
                        System.out.println("\nInsufficient balance.");
                    }
                    break;
                case 4:
                    System.out.println("\nThank you for using the ATM!");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nInvalid option. Please select a valid option.");
            }
        }
    }
}

public class AtmMachine {
    public static void main(String[] args) {
         System.out.println("\t\t-------------------WELCOME----------------");

        BankAccount userAccount = new BankAccount(1000); // Initial balance
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
