package college;

import java.util.*;

class Account {
    String accounHolder;
    String accNumber;

    public Account(String accounHolder, String accNumber) {
        this.accounHolder = accounHolder;
        this.accNumber = accNumber;
    }
}

class SavingAccount extends Account {
    double savingAmount;
    static final double INTEREST_RATE = 3.5; // Fixed interest rate (3.5% annually)

    public SavingAccount(String accounHolder, String accNumber, double savingAmount) {
        super(accounHolder, accNumber);
        this.savingAmount = savingAmount;
    }

    public void deposit(double balance) {
        if (balance >= 0) {
            savingAmount += balance;
            System.out.println("Amount " + balance + " deposited successfully!");
        } else {
            System.out.println("Amount can't be negative.");
        }
    }

    public void withdraw(double balance) {
        if (balance >= 0 && balance <= savingAmount) {
            savingAmount -= balance;
            System.out.println("Amount " + balance + " withdrawn successfully!");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double showBalance() {
        return savingAmount;
    }

    public void applyInterest() {
        double interest = (savingAmount * INTEREST_RATE) / 100;
        savingAmount += interest;
        System.out.printf("Interest of Rs %.2f applied\n", interest, savingAmount);
    }

    public void display() {
        System.out.println("\n--- Saving Account Details ---");
        System.out.println("Account No: " + accNumber);
        System.out.println("Account Holder: " + accounHolder);
        System.out.printf("Balance: Rs %.2f%n", savingAmount);
    }
}

public class BankAccount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingAccount savingAccount = null;

        while (true) {
            System.out.println("\n1. Create saving account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Show balance");
            System.out.println("5. Show Account details");
            System.out.println("6. Apply Interest");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Account Holder Name: ");
                    String accHolder = sc.nextLine();
                    System.out.print("Enter Account Number: ");
                    String accNumber = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double savingAmount = sc.nextDouble();
                    savingAccount = new SavingAccount(accHolder, accNumber, savingAmount);
                }
                case 2 -> {
                    if (savingAccount == null) {
                        System.out.println("First create a Saving Account.");
                    } else {
                        System.out.print("Enter your amount: ");
                        double amount = sc.nextDouble();
                        savingAccount.deposit(amount);
                    }
                }
                case 3 -> {
                    if (savingAccount == null) {
                        System.out.println("First create a Saving Account.");
                    } else {
                        System.out.print("Enter your amount: ");
                        double amount = sc.nextDouble();
                        savingAccount.withdraw(amount);
                    }
                }
                case 4 -> {
                    if (savingAccount == null) {
                        System.out.println("First create a Saving Account.");
                    } else {
                        System.out.println("Your balance is: " + savingAccount.showBalance());
                    }
                }
                case 5 -> {
                    if (savingAccount == null) {
                        System.out.println("First create a Saving Account.");
                    } else {
                        savingAccount.display();
                    }
                }
                case 6 -> {
                    if (savingAccount == null) {
                        System.out.println("First create a Saving Account.");
                    } else {
                        savingAccount.applyInterest();
                    }
                }
                case 7 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
