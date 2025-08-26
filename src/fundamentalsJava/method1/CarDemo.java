package fundamentalsJava.method1;

public class CarDemo {
    public static void main(String[] args) {
        Car BMW = new Car("X5", 2025, "зелёная");
        BMW.startEngine();
        BMW.stopEngine();
        BMW.setColor("красная");
        BMW.displayInfo();

        Car Mercedes = new Car("S500", 2015, "синяя");
        Mercedes.startEngine();
        Mercedes.stopEngine();
        Mercedes.displayInfo();

    }
}
