package $08_Methods;

class Cylinder{
    public double radius;
    public double height;
    public double lidArea(){
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea(){
        return 2*lidArea()+circumference()*height;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double volume(){
        return lidArea()*height;
    }
}
public class _25_Cylinder_class {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius = 7;
        c.height = 10;
        System.out.println("\nLid area : "+c.lidArea());
        System.out.println("Total surface area : "+c.totalSurfaceArea());
        System.out.println("Circumference : "+c.circumference());
        System.out.println("Volume : "+c.volume());
    }
}
