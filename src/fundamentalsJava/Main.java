package fundamentalsJava;

public class Main {
    public static void main(String[] args) {
        Car BMW = new Car("X5", 2025, "зелёная", true);
        BMW.startEngine();
        BMW.stopEngine();
        BMW.setColor("красная");
        BMW.displayInfo();

        Car Mercedes = new Car("S500", 2015, "синяя", false);
        Mercedes.startEngine();
        Mercedes.stopEngine();
        Mercedes.displayInfo();

    }
}
