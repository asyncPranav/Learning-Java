package $14_Static_Keyword;

class HondaCity{
    static long price = 100;
    int a,b;
    static double onRoadPrice(String city){
        switch(city){
            case "delhi" : return price+price*0.4;
            case "mumbai" : return price+price*0.9;
            case "banglore" : return price+price*0.7;
            case "hyderabad" : return price+price*0.5;
            default : return price+price*0.1;
        }
    }
    static int x=2;
    int y=3;
}
public class _01_StaticKeyword {
    public static void main(String[] args) {

        HondaCity h1 = new HondaCity();
        HondaCity h2 = new HondaCity();

        System.out.println("\nPrice of car via class reference : "+HondaCity.price);
        System.out.println("Price of car upon object h1 : "+h1.price);
        System.out.println("Price of car upon object h2 : "+h2.price);

        System.out.println("\nOn Road Price of car via class reference in delhi : "+HondaCity.onRoadPrice("delhi"));
        System.out.println("On Road Price of car upon object h1 in delhi in delhi : "+h1.onRoadPrice("delhi"));
        System.out.println("On Road Price of car upon object h2 in delhi : "+h2.onRoadPrice("delhi"));

        System.out.println("\nBefore modifying variables :");
        System.out.println("Upon object h1 -> x : "+h1.x+" , y : "+h1.y);
        System.out.println("Upon object h2 -> x : "+h2.x+" , y : "+h2.y);

        System.out.println("\nAfter modifying static variable :");
        h1.x = 5; //static variable
        h1.y = 6; //non-static variable
        System.out.println("Upon object h1 -> x : "+h1.x+" , y : "+h1.y);
        System.out.println("Upon object h2 -> x : "+h2.x+" , y : "+h2.y);


    }
}
