package $09_Inheritance;
import java.util.Scanner;

class Account{
    //properties
    private String accNumber;
    private String accHolder;
    private String address;
    private String mobileNo;
    private String dob;
    private long balance;

    //properties methods - getter
    public String getAccNumber() {
        return accNumber;
    }
    public String getAccHolder() {
        return accHolder;
    }
    public String getAddress(){
        return address;
    }
    public String getMobileNo(){
        return mobileNo;
    }
    public String getDob() {
        return dob;
    }
    public long getBalance() {
        return balance;
    }

    //properties methods - setter
    public void setAddress(String address){
        this.address = address;
    }
    public void setMobileNo(String mobileNo){
        this.mobileNo = mobileNo;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }

    //constructor
    public Account(String accNumber, String accHolder, String address, String mobileNo, String dob, long balance){
        this.accNumber = accNumber;
        this.accHolder = accHolder;
        this.address = address;
        this.mobileNo = mobileNo;
        this.dob = dob;
        this.balance = balance;
    }

    //instance method
    public void display(){
        System.out.println("\nAccount no : "+getAccNumber());
        System.out.println("Account holder : "+getAccHolder());
        System.out.println("Address : "+getAddress());
        System.out.println("Mobile no : "+getMobileNo());
        System.out.println("Date of birth : "+getDob());
        System.out.println("Balance : "+getBalance());

    }
}
class SavingAccount extends Account {

    //constructor
    public SavingAccount(String accNumber, String accHolder, String address, String mobileNo, String dob, long balance) {
        super(accNumber, accHolder, address, mobileNo, dob, balance);
        /*
         If you do not use super in the constructor of a subclass, the compiler will implicitly try to call the parameterless (default) constructor of the superclass.
         Since the Account class does not have a parameterless constructor, the compiler will throw an error:

            🔍 Why Does This Happen?
            Implicit super() Call:
            If you don't explicitly call super(...), Java tries to call super() (the default constructor of the superclass).

            No Default Constructor:
            Since Account requires parameters, and you did not define a default constructor (public Account() {}), the implicit call fails.
         */
    }


    //instance methods
    public void deposit(long amnt) {
        if (amnt > 0) {
            setBalance(getBalance() + amnt);
            System.out.println("Rs "+amnt+" deposited successfully");
        }else{
            System.out.println("Invalid amount..!!");
        }
    }
    public void withdraw(long amnt){
        if(amnt>0 && amnt<=getBalance()){
            setBalance(getBalance() - amnt);
            System.out.println("Rs "+amnt+" withdrew successfully");
        }else{
            System.out.println("Invalid amount..!!");
        }
    }
}
class LoanAccount extends Account{

    //constructor
    public LoanAccount(String accNumber, String accHolder, String address, String mobileNo, String dob, long balance) {
        super(accNumber, accHolder, address, mobileNo, dob, balance);
    }

    //instance methods
    public void payEMI(long amnt){
        if(amnt>0 && amnt<=getBalance()){
            setBalance(getBalance() - amnt);
            System.out.println("Rs "+amnt+" EMI paid successfully");
        }else{
            System.out.println("Invalid EMI amount or exceeds balance amount..!!");
        }
    }
    public void payLoan(long amnt){
        if(amnt>0 && amnt<=getBalance()){
            setBalance(getBalance() - amnt);
            System.out.println("Complete loan paid successfully");
        }else{
            System.out.println("Invalid amount or exceeds balance amount..!!");
        }
    }
}
public class _04_Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Account Type: 1. Savings  2. Loan");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

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
            SavingAccount sa = new SavingAccount(accNumber, accHolder, address, mobileNo, dob, balance);
            sa.display();

            System.out.println("\nChoose Operation: 1. Deposit  2. Withdraw");
            int op = sc.nextInt();

            if (op == 1) {
                System.out.print("Enter Deposit Amount: ");
                long amount = sc.nextLong();
                sa.deposit(amount);
            } else if (op == 2) {
                System.out.print("Enter Withdrawal Amount: ");
                long amount = sc.nextLong();
                sa.withdraw(amount);
            } else {
                System.out.println("Invalid operation choice!");
            }
            sa.display();

        } else if (choice == 2) {
            LoanAccount la = new LoanAccount(accNumber, accHolder, address, mobileNo, dob, balance);
            la.display();

            System.out.println("\nChoose Operation: 1. Pay EMI  2. Repay Loan");
            int op = sc.nextInt();

            if (op == 1) {
                System.out.print("Enter EMI Amount: ");
                long amount = sc.nextLong();
                la.payEMI(amount);
            } else if (op == 2) {
                System.out.print("Enter Loan Repayment Amount: ");
                long amount = sc.nextLong();
                la.payLoan(amount);
            } else {
                System.out.println("Invalid operation choice!");
            }
            la.display();

        } else {
            System.out.println("Invalid account type choice!");
        }

        sc.close();
    }
}
