public class Car {

    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("Машина " + brand + " " + model + " заведена.");
    }

    public void info() {
        System.out.println("Машина " + brand + " " + model + " " + year + " года выпуска.");
    }
}
