public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 40);
        person.introduce();

        Car myCar = new Car("Toyota", "Corolla", 2020);
        myCar.start();
        myCar.info();
    }
}