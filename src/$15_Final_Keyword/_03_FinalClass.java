package $15_Final_Keyword;

final class Car {
    void drive() {
        System.out.println("Driving a car...");
    }
}

// class SportsCar extends Car { // ❌ Compilation Error: Cannot extend final class
// }

public class _03_FinalClass {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}