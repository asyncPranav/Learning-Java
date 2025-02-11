package $08_Methods;

public class _20_Sum_using_var_arg {
    static int totalSum(int...x){
        int sum=0;
        for(int y : x){
            sum  += y;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(totalSum());
    }
}
