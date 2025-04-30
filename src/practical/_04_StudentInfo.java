package practical;

public class _04_StudentInfo {
    private String name;
    private int age;
    private String roll;

    public _04_StudentInfo(String name, int age, String roll){
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    public void display(){
        System.out.println("Student's name : "+name);
        System.out.println("Student's age : "+age);
        System.out.println("Student's rollNo : "+roll);
    }
    public static void main(String[] args) {
        _04_StudentInfo obj = new _04_StudentInfo("Pranav singh", 23, "2343uio");
        obj.display();
    }
}
