package $05_Conditional_Statements;

public class _14_Ifelse_ladder_check_all_cond {
    public static void main(String[] args) {

        //if-else ladder check all condition while switch-case directly execute matching case
        //add break point in line 7 then debug to see
        int n = 4;
        if(n==1){
            System.out.println("one");
        }else if(n==2){
            System.out.println("two");
        }else if(n==3){
            System.out.println("three");
        }else if(n==4){
            System.out.println("four");
        }else{
            System.out.println("invalid");
        }

        switch(n){
            case 1 :
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;
            case 3 :
                System.out.println("three");
                break;
            case 4 :
                System.out.println("four");
                break;
            default :
                System.out.println("invalid");
        }

    }
}
