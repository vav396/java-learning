package fundamentalsJava;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println("Гав! Я " + name + "!");
    }

    public void info() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}
