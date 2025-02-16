package college;
import java.util.Scanner;

public class FibonacciAdvance {

    // Recursive method
    static int withRecursion(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return withRecursion(n - 2) + withRecursion(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        inputLabel: // Label added here
        while (true) {
            System.out.print("\nEnter number of terms: ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Enter an integer.");
                sc.nextLine(); // Clear the invalid input
                System.out.print("\nEnter number of terms: ");
            }
            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Number of terms must be positive");
                continue inputLabel; // Go back to the labeled section
            } else {

                int a=0, b=1, c;

                // Without Recursion
                int sum1 = 0;
                System.out.print("\nWithout Recursion: ");
                for(int i=0; i<n; i++){
                    if(i<=1){
                        c=i;
                    }else{
                        c=a+b;
                        a=b;
                        b=c;
                    }
                    sum1 += c;
                    System.out.print(c+" ");
                }
                System.out.println("\nSum without Recursion: " + sum1);


                // With Recursion
                int sum2 = 0;
                System.out.print("With Recursion: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(withRecursion(i) + " ");
                    sum2 += withRecursion(i);
                }

                System.out.println("\nSum with Recursion: " + sum2);
                break; // Exit the loop after successful input and output
            }
        }

        sc.close(); // Close the Scanner object
    }
}

