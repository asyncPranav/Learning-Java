//input details of 3 students and print them

package $08_Methods;
import java.util.Scanner;

class Students{

    //properties
    private String name;
    private int rollNo;
    private String course;
    private int[] marks;

    //non-parameterized constructor
    Students(String name, int rollNo, String course, int[] marks){
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        this.marks = marks;
    }

    //instance methods
    public int totalMarks(){
        return marks[0]+marks[1]+marks[2];
    }
    public float avgMarks(){
        return (float)totalMarks()/3;
    }
    public char grade(){
        if(avgMarks()>=90){
            return 'A';
        }else if(avgMarks()>=80){
            return 'B';
        }else if(avgMarks()>=70){
            return 'C';
        }else if(avgMarks()>=60){
            return 'D';
        }else{
            return 'E';
        }
    }

    public String showDetails(){
        return "\nName : "+name+
                "\nRoll no : "+rollNo+
                "\nCourse : "+course+
                "\nMarks of three subjects : "+marks[0]+", "+marks[1]+", "+marks[2]+
                "\nTotal marks : "+totalMarks()+
                "\nAverage marks : "+avgMarks()+
                "\nGrade : "+grade();
    }
}
public class _33_Student_details_input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creating array of Student

        Students[] s = new Students[3];

        for(int i=0; i<3; i++){
            System.out.println("\n<------------------Student "+(i+1)+"------------------>");
            System.out.print("Enter name of student : ");
            String name = sc.nextLine();
            System.out.print("Enter roll no of student : ");
            int roll = sc.nextInt();
            sc.nextLine(); //to clear buffer
            System.out.print("Enter course of student : ");
            String course = sc.nextLine();
            System.out.print("Enter marks of three subjects of student : ");
            int[] marks = new int[3]; //array to store marks of 3 subjects
            for(int j=0; j<3; j++){
                marks[j] = sc.nextInt();
            }
            sc.nextLine(); // Clear buffer after marks input

            //initialise student object and store in the array
            s[i] = new Students(name, roll, course, marks);

        }

        //output students details
        System.out.println("\n<------------------Student Details------------------>");
        for(Students x : s){
            System.out.println(x.showDetails());
            System.out.println("\n-------------------------------------------------");
        }

        //close Scanner
        sc.close();


    }
}
