package projects;
import java.util.Scanner;

class Account {
    protected String accNumber;
    protected String accHolder;
    protected String address;
    protected String mobileNo;
    protected String dob;
    protected double balance;

    public Account(String accNumber, String accHolder, String address, String mobileNo, String dob, double balance) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        this.address = address;
        this.mobileNo = mobileNo;
        this.dob = dob;
        this.balance = balance;
    }

    public void display() {
        System.out.println("\n--- Saving Account Details ---");
        System.out.println("Account No: " + accNumber);
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Address: " + address);
        System.out.println("Mobile No: " + mobileNo);
        System.out.println("Date of Birth: " + dob);
        System.out.printf("Balance: Rs %.2f%n",balance);
    }
}

class SavingAccount extends Account {
    public SavingAccount(String accNumber, String accHolder, String address, String mobileNo, String dob, double balance) {
        super(accNumber, accHolder, address, mobileNo, dob, balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Rs " + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Rs " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid amount or insufficient balance!");
        }
    }
}

class LoanAccount extends Account {
    private double loanAmount;
    private double interestRate;
    private int tenureMonths;
    private double emiAmount;
    private SavingAccount linkedSavingsAccount;

    public LoanAccount(SavingAccount linkedSavingsAccount, double loanAmount, double interestRate, int tenureMonths) {
        super(linkedSavingsAccount.accNumber, linkedSavingsAccount.accHolder, linkedSavingsAccount.address,
                linkedSavingsAccount.mobileNo, linkedSavingsAccount.dob, linkedSavingsAccount.balance);
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.tenureMonths = tenureMonths;
        this.emiAmount = calculateEMI(loanAmount, interestRate, tenureMonths);
        this.linkedSavingsAccount = linkedSavingsAccount;
    }

    private double calculateEMI(double principal, double annualRate, int months) {
        double monthlyRate = annualRate / 12 / 100;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                (Math.pow(1 + monthlyRate, months) - 1);
    }


    /*
    //if user overpay emi then extra amount will be added to saving account's balance
    //here you have to enter amount manually for EMI payment
    public void payEMI(double paymentAmount) {
        if (linkedSavingsAccount.balance >= paymentAmount) {
            double extraAmount = paymentAmount - emiAmount; // Calculate extra paid

            if (extraAmount > 0.00001) {// Small threshold to avoid floating-point precision issues ( because it take 0.00>0 -> true )
                System.out.printf("Extra Rs %.2f detected! Crediting back to Savings Account.\n", extraAmount);
                linkedSavingsAccount.balance += extraAmount; // Return extra amount
            }

            linkedSavingsAccount.balance -= paymentAmount; // Deduct only EMI amount
            loanAmount -= emiAmount; // Reduce loan balance

            if (loanAmount <= 0) {  // If the loan is fully paid
                loanAmount = 0;
                tenureMonths = 0;
                emiAmount = 0;  // Reset EMI since loan is fully paid
                System.out.println("Loan fully repaid. No further EMI required.");
            } else {
                tenureMonths--; // Reduce tenure only if loan is not fully paid
            }

            System.out.printf("Rs %.2f EMI paid successfully from Savings Account.\n", emiAmount);
        } else {
            System.out.println("Insufficient balance in Savings Account to pay EMI!");
        }
    }

    //---> use this case statement for this method
    case 5 -> {
        if (loanAccount != null) {
            System.out.print("Enter EMI Payment Amount: ");
            double paymentAmount = sc.nextDouble(); // Take user input
            loanAccount.payEMI(paymentAmount); // Pass the entered amount
        } else {
            System.out.println("No Loan Account found!");
        }
    }
    */



    //------> when user select pay EMI, it get paid automatically using saving account balance without taking any parameter
    public void payEMI() {
        if (linkedSavingsAccount.balance >= emiAmount) {
            linkedSavingsAccount.balance -=  emiAmount; // Deduct EMI from savings
            loanAmount -= emiAmount; // Deduct EMI from loan balance

            if (loanAmount <= 0) {  // If the loan is fully paid
                loanAmount = 0;
                tenureMonths = 0;
                emiAmount = 0;  // Reset EMI since loan is fully paid
                System.out.println("Loan fully repaid. No further EMI required.");
            } else {
                tenureMonths--; // Reduce tenure only if loan is not fully paid
            }

            System.out.printf("Rs %.2f EMI paid successfully from Savings Account%n", emiAmount);
        } else {
            System.out.println("Insufficient balance in Savings Account to pay EMI!");
        }
    }



        /*
    //if user overpay  then extra amount will be added to saving account's balance
    //here you have to enter amount manually for payLoan amount
    public void payLoan(double amount) {
        if (amount > 0 && amount <= linkedSavingsAccount.balance) {
            double actualDeduction = Math.min(amount, loanAmount); // Deduct only what's required
            linkedSavingsAccount.balance -= actualDeduction;
            loanAmount -= actualDeduction;

            System.out.printf("Loan repayment of Rs %.2f successful.%n",actualDeduction);

            double refund = amount - actualDeduction; // Calculate any excess payment
            if (refund > 0) {
                //linkedSavingsAccount.balance += refund; // Refund excess amount
                System.out.printf("Rs %.2f refunded to your Savings Account.%n", refund);
            }

            if (loanAmount == 0) {
                tenureMonths = 0;
                emiAmount = 0;
                System.out.println("Congratulations! Loan fully repaid.");
            }
        } else {
            System.out.println("Invalid amount or insufficient balance in Savings Account!");
        }
    }

    //use this case statement for this method
    case 6 -> {
        if (loanAccount != null) {
            System.out.print("Enter Loan Repayment Amount: ");
            double amount = sc.nextLong();
            loanAccount.payLoan(amount);
        } else {
            System.out.println("No Loan Account found!");
        }
    }
    */



    // ---> pays complete loan automatically using saving acc balance without taking any parameter
    public void payLoan() {
        if (linkedSavingsAccount.balance >= loanAmount) {
            linkedSavingsAccount.balance -= loanAmount;
            System.out.printf("Rs %.2f deducted from Savings Account to repay the full loan.%n", loanAmount);

            // Reset loan details
            loanAmount = 0;
            tenureMonths = 0;
            emiAmount = 0;

            System.out.println("Congratulations! Your loan has been fully repaid.");
        } else {
            System.out.println("Insufficient balance in Savings Account to repay the full loan!");
        }
    }




    //@Override
    // public void display() {
    //     super.display();
    //     System.out.printf("Loan Amount: Rs %.2f%n", loanAmount);
    //     System.out.printf("EMI Amount: Rs %.2f%n", emiAmount);
    //     System.out.println("Loan Tenure: " + tenureMonths + " months");
    // }

    @Override
    public void display() {
        System.out.println("\n--- Loan Account Details ---");
        System.out.println("Account No: " + accNumber);
        System.out.println("Account Holder: " + accHolder);
        System.out.printf("Loan Amount Remaining: Rs %.2f%n", loanAmount);
        if (loanAmount > 0) { // Only display EMI if loan is active
            System.out.printf("EMI Amount: Rs %.2f%n", emiAmount);
            System.out.println("Loan Tenure Left: " + tenureMonths + " months");
        } else {
            System.out.println("Loan fully repaid.");
        }
    }
}



public class _02_BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingAccount savingsAccount = null;
        LoanAccount loanAccount = null;

        while (true) {
            System.out.println("\n--- Account Management System ---");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Loan Account");
            System.out.println("3. Deposit (Savings Account)");
            System.out.println("4. Withdraw (Savings Account)");
            System.out.println("5. Pay EMI (Loan Account)");
            System.out.println("6. Repay Loan (Loan Account)");
            System.out.println("7. Display Account Details");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Account Number: ");
                    String accNumber = sc.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String accHolder = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();
                    System.out.print("Enter Mobile Number: ");
                    String mobileNo = sc.nextLine();
                    System.out.print("Enter Date of Birth (dd-mm-yyyy): ");
                    String dob = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextLong();

                    savingsAccount = new SavingAccount(accNumber, accHolder, address, mobileNo, dob, balance);
                    System.out.println("Savings Account created successfully.");
                }

                case 2 -> {
                    if (savingsAccount == null) {
                        System.out.println("Please create a Savings Account first!");
                        break;
                    }
                    System.out.print("Enter Loan Amount: ");
                    double loanAmount = sc.nextDouble();
                    System.out.print("Enter Annual Interest Rate (%): ");
                    double interestRate = sc.nextDouble();
                    System.out.print("Enter Loan Tenure (Months): ");
                    int tenureMonths = sc.nextInt();

                    loanAccount = new LoanAccount(savingsAccount, loanAmount, interestRate, tenureMonths);
                    System.out.println("Loan Account created successfully using your existing Savings Account details.");
                }

                case 3 -> {
                    if (savingsAccount != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double amount = sc.nextLong();
                        savingsAccount.deposit(amount);
                    } else {
                        System.out.println("No Savings Account found!");
                    }
                }

                case 4 -> {
                    if (savingsAccount != null) {
                        System.out.print("Enter Withdrawal Amount: ");
                        double amount = sc.nextLong();
                        savingsAccount.withdraw(amount);
                    } else {
                        System.out.println("No Savings Account found!");
                    }
                }

                case 5 -> {
                    if (loanAccount != null) {
                        loanAccount.payEMI();
                    } else {
                        System.out.println("No Loan Account found!");
                    }
                }


                case 6 -> {
                    if (loanAccount != null) {
                        loanAccount.payLoan();
                    } else {
                        System.out.println("No Loan Account found!");
                    }
                }

                case 7 -> {
                    if (savingsAccount != null) {
                        savingsAccount.display();
                    }
                    if (loanAccount != null) {
                        loanAccount.display();
                    }
                    if (savingsAccount == null && loanAccount == null) {
                        System.out.println("No accounts found!");
                    }
                }

                case 8 -> {
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
