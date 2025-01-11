package $05_Conditional_Statements;

import java.util.Scanner;

public class _10_Student_grades {
    public static void main(String[] args) {

        //input marks of 3 subject from user then print the grade
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks of three subjects : ");
        float s1 = input.nextFloat();
        float s2 = input.nextFloat();
        float s3 = input.nextFloat();

        float sum = s1+s2+s3;
        float percentage = (float)sum/3;
        int per = (int)percentage;

        if(per>=80){
            System.out.println("A");
        }else if(per>=60 && per<80){
            System.out.println("B");
        }else if(per>=50 && per<60){
            System.out.println("C");
        }else if(per>=40 && per<50){
            System.out.println("D");
        }else{
            System.out.println("E");
        }

    }
}
