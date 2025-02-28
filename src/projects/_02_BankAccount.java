package projects;
import java.util.Scanner;

class Account {
    private String accNumber;
    private String accHolder;
    private String address;
    private String mobileNo;
    private String dob;
    private long balance;

    // Getter methods
    public String getAccNumber() { return accNumber; }
    public String getAccHolder() { return accHolder; }
    public String getAddress() { return address; }
    public String getMobileNo() { return mobileNo; }
    public String getDob() { return dob; }
    public long getBalance() { return balance; }

    // Setter methods
    public void setAddress(String address) { this.address = address; }
    public void setMobileNo(String mobileNo) { this.mobileNo = mobileNo; }
    public void setBalance(long balance) { this.balance = balance; }

    // Constructor
    public Account(String accNumber, String accHolder, String address, String mobileNo, String dob, long balance) {
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        this.address = address;
        this.mobileNo = mobileNo;
        this.dob = dob;
        this.balance = balance;
    }

    // Display account details
    public void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account No: " + getAccNumber());
        System.out.println("Account Holder: " + getAccHolder());
        System.out.println("Address: " + getAddress());
        System.out.println("Mobile No: " + getMobileNo());
        System.out.println("Date of Birth: " + getDob());
        System.out.println("Balance: Rs " + getBalance());
    }
}

// Savings Account class
class SavingAccount extends Account {
    public SavingAccount(String accNumber, String accHolder, String address, String mobileNo, String dob, long balance) {
        super(accNumber, accHolder, address, mobileNo, dob, balance);
    }

    public void deposit(long amnt) {
        if (amnt > 0) {
            setBalance(getBalance() + amnt);
            System.out.println("Rs " + amnt + " deposited successfully");
        } else {
            System.out.println("Invalid amount..!!");
        }
    }

    public void withdraw(long amnt) {
        if (amnt > 0 && amnt <= getBalance()) {
            setBalance(getBalance() - amnt);
            System.out.println("Rs " + amnt + " withdrew successfully");
        } else {
            System.out.println("Invalid amount or insufficient balance..!!");
        }
    }
}

// Loan Account class
class LoanAccount extends Account {
    private double interestRate;
    private int tenureMonths;
    private double emiAmount;

    // Constructor
    public LoanAccount(String accNumber, String accHolder, String address, String mobileNo, String dob, long balance,
                       double interestRate, int tenureMonths) {
        super(accNumber, accHolder, address, mobileNo, dob, balance);
        this.interestRate = interestRate;
        this.tenureMonths = tenureMonths;
        this.emiAmount = calculateEMI(getBalance(), interestRate, tenureMonths);
    }

    // EMI Calculation
    private double calculateEMI(long principal, double annualRate, int months) {
        double monthlyRate = annualRate / 12 / 100;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
                (Math.pow(1 + monthlyRate, months) - 1);
    }

    public void payEMI() {
        if (emiAmount <= getBalance()) {
            setBalance(getBalance() - (long) emiAmount);
            System.out.printf("Rs %.2f EMI paid successfully%n", emiAmount);
        } else {
            System.out.println("Insufficient balance to pay EMI..!!");
        }
    }

    public void payLoan(long amnt) {
        if (amnt > 0 && amnt <= getBalance()) {
            setBalance(getBalance() - amnt);
            System.out.println("Complete loan paid successfully");
        } else {
            System.out.println("Invalid amount or exceeds balance amount..!!");
        }
    }

    public double getEmiAmount() {
        return emiAmount;
    }
}

// Main class with Menu-driven program
public class _02_BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = null;

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
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1, 2 -> {
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
                    long balance = sc.nextLong();

                    if (choice == 1) {
                        account = new SavingAccount(accNumber, accHolder, address, mobileNo, dob, balance);
                    } else {
                        System.out.print("Enter Annual Interest Rate (%): ");
                        double rate = sc.nextDouble();
                        System.out.print("Enter Loan Tenure (Months): ");
                        int months = sc.nextInt();
                        account = new LoanAccount(accNumber, accHolder, address, mobileNo, dob, balance, rate, months);
                    }
                }

                case 3 -> {
                    if (account == null) {
                        System.out.println("No account exists. Please create a Savings Account first.");
                    } else if (account instanceof SavingAccount) {
                        System.out.print("Enter Deposit Amount: ");
                        long amount = sc.nextLong();
                        ((SavingAccount) account).deposit(amount);
                    } else {
                        System.out.println("Operation not allowed. Current account is not a Savings Account.");
                    }
                }

                case 4 -> {
                    if (account == null) {
                        System.out.println("No account exists. Please create a Savings Account first.");
                    } else if (account instanceof SavingAccount) {
                        System.out.print("Enter Withdrawal Amount: ");
                        long amount = sc.nextLong();
                        ((SavingAccount) account).withdraw(amount);
                    } else {
                        System.out.println("Operation not allowed. Current account is not a Savings Account.");
                    }
                }

                case 5 -> {
                    if (account == null) {
                        System.out.println("No account exists. Please create a Loan Account first.");
                    } else if (account instanceof LoanAccount) {
                        ((LoanAccount) account).payEMI();
                    } else {
                        System.out.println("Operation not allowed. Current account is not a Loan Account.");
                    }
                }

                case 6 -> {
                    if (account == null) {
                        System.out.println("No account exists. Please create a Loan Account first.");
                    } else if (account instanceof LoanAccount) {
                        System.out.print("Enter Loan Repayment Amount: ");
                        long amount = sc.nextLong();
                        ((LoanAccount) account).payLoan(amount);
                    } else {
                        System.out.println("Operation not allowed. Current account is not a Loan Account.");
                    }
                }

                case 7 -> {
                    if (account == null) {
                        System.out.println("No account exists. Please create an account first.");
                    } else {
                        account.display();
                    }
                }

                case 8 -> {
                    sc.close(); return;
                }

                default -> System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
