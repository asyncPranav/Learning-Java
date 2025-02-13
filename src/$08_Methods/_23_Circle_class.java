package $08_Methods;

class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double parameter() {
        return circumference();
    }
}

public class _23_Circle_class {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 5; //assign 5 to radius
        System.out.println("\nArea : " + c1.area());
        System.out.println("Circumference : " + c1.circumference());
        System.out.println("Parameter : " + c1.parameter());

        Circle c2 = new Circle();
        c2.radius = 7;
        System.out.println("\nArea : " + c2.area());
        System.out.println("Circumference : " + c2.circumference());
        System.out.println("Parameter : " + c2.parameter());

    }
}
