package $06_Iterative_Statements;
import java.util.Scanner;

public class _41_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 0) { // Negative numbers are not Armstrong numbers
            System.out.println("Not an Armstrong number");
            System.exit(0);
        }

        // ✅ Count the number of digits (Fix for n = 0)
        int digits = 0;
        for (int i = n; i > 0 || digits == 0; i /= 10) {
            digits++;
        }

        int sum = 0;
        for (int i = n; i > 0; i /= 10) {
            int rem = i % 10;
            sum += Math.pow(rem, digits);
        }

        // ✅ Compare sum with original number
        if (sum == n) {
            System.out.println("Yes, Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}

