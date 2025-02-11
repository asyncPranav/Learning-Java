package $08_Methods;

public class _12_Method_overloading {
    static int max(int x, int y){
        return (x>y) ? x : y;
    }
    static float max(float x, float y){
        return (x>y) ? x : y;
    }
    static int max(int x, int y, int z){
        return (x>y && x>z) ? x : (y>z) ? y : z;
    }


    public static void main(String[] args) {
        int a=10, b=20, c=30;
        float m=10f, n=20f;
        System.out.println(max(a,b));
        System.out.println(max(m,n));
        System.out.println(max(a,b,c));
        byte x=10, y=20;
        System.out.println(max(x,y));
    }
}
