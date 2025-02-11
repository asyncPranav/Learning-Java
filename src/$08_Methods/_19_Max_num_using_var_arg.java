package $08_Methods;

public class _19_Max_num_using_var_arg {
    static int maxNumber(int...X){
        //int max=X[0]; -> error
        int max = Integer.MIN_VALUE;
        if(X.length==0){
            return Integer.MIN_VALUE;
        }else{
            for(int i=0; i<X.length; i++){
                if(X[i]>max){
                    max=X[i];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxNumber());
        System.out.println(maxNumber(1));
        System.out.println(maxNumber(1,2,3));
        System.out.println(maxNumber(4,5,6,7,8,9,1,2,3));

    }
}
