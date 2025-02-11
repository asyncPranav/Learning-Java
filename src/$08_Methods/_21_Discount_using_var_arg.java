package $08_Methods;

public class _21_Discount_using_var_arg {
    static double totalDiscount(double...price){
        double sum=0;
        for(double x : price){
            sum += x;
        }
        double discount=0;
        if(sum<200){
            discount=sum*10/100;
        }else if(sum<400){
            discount=sum*20/100;
        }else if(sum<600){
            discount=sum*30/100;
        }else{
            discount=sum*40/100;
        }
        return discount;
    }

    public static void main(String[] args) {
        System.out.println(totalDiscount(14,19,20,10));
        System.out.println(totalDiscount(20,15,25,30));
        System.out.println(totalDiscount(13,24,34,56,78,90));
        System.out.println(totalDiscount(50,34,18,50,30));
        System.out.println(totalDiscount(14,19,20,10,10,90));
        System.out.println(totalDiscount(20,10,10));

    }
}
