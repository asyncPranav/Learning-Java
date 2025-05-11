package practical;
import java.util.Scanner;

public class _09_GradeCalculator {
    Scanner sc = new Scanner(System.in);
    double a,b;

    public void get(){
        System.out.print("Enter marks of two subjects : ");
        a = sc.nextDouble();
        b = sc.nextDouble();

    }

    public double compute(){
        return (a+b)/2;
    }

    public void display(){
        double avg = compute();
        if(avg>=80){
            System.out.println("A");
        } else if(avg>=60) {
            System.out.println("B");
        } else if(avg<60 && avg>=40 ) {
            System.out.println("C");
        } else{
            System.out.println("D");
        }
    }

    public static void main(String[] args) {
        _09_GradeCalculator gc = new _09_GradeCalculator();
        gc.get();
        gc.display();
    }
}
