package practical;

public class _08_MethodOverloading {
    public static void show(){
        System.out.println("Non-param show method");
    }
    public static void show(int a){
        System.out.println("Integer-param show method");
    }
    public static void show(float b){
        System.out.println("Float-param show method");
    }
    public static void main(String[] args) {
        show();
        show(2);
        show(3.4f);
    }
}
