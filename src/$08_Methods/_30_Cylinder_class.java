package $08_Methods;

class Cylinder1{
    //properties
    private float height;
    private float radius;

    //property methods
    public float getHeight(){
        return height;
    }
    public float getRadius() {
        return radius;
    }
    public void setHeight(float h) {
        height = (h>=0) ? h : 0;
    }

    public void setRadius(float r) {
        radius = (r>=0) ? r : 0;
    }
    public void setDimensions(float r, float h){ //---> you can set height and radius simultaneously
        height = (h>=0) ? h : 0;
        radius = (r>=0) ? r : 0;
    }

    //non-parameterized constructor
    public Cylinder1(){
        height=0;
        radius=0;
    }
    //parameterized constructor ---> method-01
    public Cylinder1(float r, float h){
        setRadius(r);
        setHeight(h);
    }

    /* parameterized constructor ---> method-02

    public Cylinder1(float r, float h){
        setDimensions(r,h);
    }

     */

    //instance methods -> operator
    public float lidArea(){
        return (float) Math.PI*radius*radius;
    }
    public float parameter(){
        return (float) (2*Math.PI*radius);
    }
    public float totalArea(){
        return 2*lidArea()+ parameter()*height;
    }
    public float volume(){
        return lidArea()*height;
    }

}
public class _30_Cylinder_class {
    public static void main(String[] args) {
        Cylinder1 c1 = new Cylinder1(10, 2);
        System.out.println("Height : "+c1.getHeight());
        System.out.println("Radius : "+c1.getRadius());
        System.out.println("Lid area : "+c1.lidArea());
        System.out.println("Parameter : "+c1.parameter());
        System.out.println("Total area: "+c1.totalArea());
        System.out.println("Volume : "+c1.volume());

    }
}
