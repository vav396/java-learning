package fundamentalsJava.method2;


public class GarageDemo {
    public static void main(String[] args) {
        Car BMW = new Car("X5", 2025, "зелёная");
        BMW.startEngine();
        BMW.stopEngine();
        BMW.setColor("красная");
        System.out.println(BMW);

        Car Mercedes = new Car("S500", 2015, "синяя");
        Mercedes.startEngine();
        Mercedes.stopEngine();
        System.out.println(Mercedes);

        Car Audi = new Car("A4", 2010, "белая");
        System.out.println(Audi);

        System.out.println("Всего создано машин: " + Car.getTotalCars());

        Car car1 = new Car("Tesla", 2023, "белая");
        Car car2 = new Car("Tesla", 2023, "белая");
        System.out.println("car1.equals(car2): " + car1.equals(car2));
    }
}
