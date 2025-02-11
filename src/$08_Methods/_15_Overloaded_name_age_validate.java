package $08_Methods;
import java.util.Scanner;

public class _15_Overloaded_name_age_validate {
    //name validate method
    static boolean validate(String name){
        return name.matches("[a-zA-z\\s]+");
    }

    //age validate method
    static boolean validate(int age){
        return age>=3 && age<=15;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = sc.nextLine();


        System.out.print("Enter age : ");
        int age = sc.nextInt();

        System.out.println(validate(name));
        System.out.println(validate(age));

    }
}
