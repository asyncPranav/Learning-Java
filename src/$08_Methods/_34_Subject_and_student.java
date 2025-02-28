package $08_Methods;

class Subjectt{

    //properties
    private String subjectId;
    private String subjectName;
    private float totalMarks;

    //property-method (getter)
    public String getSubjectId() {
        return subjectId;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public float getTotalMarks() {
        return totalMarks;
    }


    //property-method (setter) - subjectId and subjectName are read only
    public void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }


    //parameterized constructor - with constructor chaining
    Subjectt(String subjectId, String subjectName){
        this(subjectId, subjectName, 0.0f);
    }
    Subjectt(String subjectId, String subjectName, float totalMarks){
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.totalMarks = totalMarks;
    }

    //instance methods
    public String toString(){
        return "\nSubject ID : "+getSubjectId()+
                "\nSubject name : "+getSubjectName()+
                "\nTotal marks : "+getTotalMarks();

    }
}

class Studentt{

    //properties
    private String studentName;
    private int rollNo;
    private String[] subjects;
    private float[] marks;


    //property-method (getter)
    public String getStudentName() {
        return studentName;
    }
    public int getRollNo() {
        return rollNo;
    }
    public String[] getSubjects() {
        return subjects;
    }
    public float[] getMarks() {
        return marks;
    }


    //property-method (setter) -> studentName and rollNo are read only
    public void setMarks(float[] marks){
        this.marks = marks;
    }
    public void setSubjects(String[] subjects){
        this.subjects = subjects;
    }

    //parameterized constructor - with constructor chaining
    Studentt(String studentName, int rollNo){
        this(studentName, rollNo, new String[0], new float[0]); //for explanation - check obsidian java doubt 12
    }
    Studentt(String studentName, int rollNo, String[] subjects, float[] marks){
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.subjects = subjects;
        this.marks = marks;
    }


    //instance methods
    public void printMarks(){
        System.out.print("Marks obtained : ");
        for(float x : marks){
            System.out.print(x+" ");
        }
    }
    public float printTotalMarksObtained(){
        float sum=0.0f;
        for(float x : marks){
            sum += x;
        }
        return sum;
    }

    /* --->Assuming each subject is of 100 marks

    public float printPercentage() {
        float totalPossibleMarks = subjects.length * 100; // Assuming each subject has 100 marks
        return (printTotalMarksObtained() / totalPossibleMarks) * 100;
    }

     */

    // If each subject has a different total mark
    public float printPercentage(Subjectt[] subjectsArray){
        float totalPossibleMarks = 0.0f;
        // Calculate total possible marks by summing the total marks of each subject
        for(Subjectt x : subjectsArray){
            totalPossibleMarks += x.getTotalMarks();
        }
        return printTotalMarksObtained()*100/totalPossibleMarks;
    }
    public boolean printQualified(Subjectt[] subjectsArray){
        return printPercentage(subjectsArray) >= 40;
    }

    //print Student Details
    public void printStudentDetails(Subjectt[] subjectsArray) {
        System.out.println("\nStudent Name : " + studentName);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Subjects and Marks Obtained:");

        for (int i = 0; i < subjects.length; i++) {
            System.out.println("  - " + subjects[i] + " : " + marks[i] +
                    " / " + subjectsArray[i].getTotalMarks());
        }

        System.out.println("Total Marks Obtained : " + printTotalMarksObtained());
        System.out.println("Percentage           : " + printPercentage(subjectsArray) + "%");
        System.out.println("Qualified            : " + (printQualified(subjectsArray) ? "Yes" : "No"));
        System.out.println("-----------------------------");
    }


}
public class _34_Subject_and_student {
    public static void main(String[] args) {

        //array of subjectt objects
        Subjectt[] sub = new Subjectt[3];
        sub[0] = new Subjectt("S001", "Data Structure", 100);
        sub[1] = new Subjectt("S002", "Algorithm", 100);
        sub[2] = new Subjectt("S003", "Networking", 100);

        //output subjects details

        //-------> method-01
        //System.out.println(sub[0]);
        //System.out.println(sub[1]);
        //System.out.println(sub[2]);

        //------> method-02
        for(Subjectt x : sub){
            System.out.println(x);
        }


        Studentt[] students = new Studentt[2];
        String[] subjects1 = {"Data Structure", "Algorithm", "Networking"};
        float[] marks1 = {80, 70, 60};

        String[] subjects2 = {"Data Structure", "Algorithm", "Networking"};
        float[] marks2 = {50, 40, 45};

        students[0] = new Studentt("John Doe", 101, subjects1, marks1);
        students[1] = new Studentt("Jane Smith", 102, subjects2, marks2);

        System.out.println("\n👨‍🎓 Student Details and Performance:");
        for (Studentt student : students) {
            student.printStudentDetails(sub);
        }


    }
}
