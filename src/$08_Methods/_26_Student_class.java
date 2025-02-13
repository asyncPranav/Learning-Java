package $08_Methods;
import java.util.Scanner;

class Student{
    public int rollNo;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int totalMarks(){
        return m1+m2+m3;
    }
    public float avgMarks(){
        return (float)totalMarks()/3;
    }
    public char grade(){
        if(avgMarks()>90){
            return 'A';
        }else if(avgMarks()>80){
            return 'B';
        }else if(avgMarks()>70){
            return 'C';
        }else if(avgMarks()>60){
            return 'D';
        }else{
            return 'E';
        }
    }
    public void showDetails1(){
        System.out.println("\nName : "+name);
        System.out.println("Roll no : "+rollNo);
        System.out.println("Course : "+course);
        System.out.println("Marks of three subjects : "+m1+", "+m2+", "+m3);
        System.out.println("Total marks : "+totalMarks());
        System.out.println("Average marks : "+avgMarks());
        System.out.println("Grade : "+grade());
    }
    public String showDetails2(){
        return "\nName : "+name+
                "\nRoll no : "+rollNo+
                "\nCourse : "+course+
                "\nMarks of three subjects : "+m1+", "+m2+", "+m3+
                "\nTotal marks : "+totalMarks()+
                "\nAverage marks : "+avgMarks()+
                "\nGrade : "+grade();
    }
    //in above method if we change method name from "showDetails2()" -> "toString()" , now check sout() in main()
    public String toString(){
        return "\nName : "+name+
                "\nRoll no : "+rollNo+
                "\nCourse : "+course+
                "\nMarks of three subjects : "+m1+", "+m2+", "+m3+
                "\nTotal marks : "+totalMarks()+
                "\nAverage marks : "+avgMarks()+
                "\nGrade : "+grade();
    }
}
public class _26_Student_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("\nEnter name of student : ");
        s.name = sc.nextLine();
        System.out.print("Enter roll no of student : ");
        s.rollNo = sc.nextInt();
        sc.nextLine(); //to clear buffer
        System.out.print("Enter course of student : ");
        s.course = sc.nextLine();
        System.out.print("Enter marks of three subjects of student : ");
        s.m1 = sc.nextInt();
        s.m2 = sc.nextInt();
        s.m3 = sc.nextInt();

        //three ways of printing details
        s.showDetails1();
        System.out.println(s.showDetails2());
        System.out.println(s);
        //here we are not calling any method of class "Student" upon object "s" rather we are directly giving reference of an object , it is calling toString() method
        //if you want to print the object itself then object should have "toString()" method implemented , if toString() method is there then automatically it will be called by println() method where we are passing direct reference to the object
    }
}