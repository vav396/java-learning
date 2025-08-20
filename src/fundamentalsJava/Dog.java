package fundamentalsJava;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст не может быть отрицательным!");
            return;
        } else {
            this.age = age;
        }
    }

        public void bark() {
            System.out.println("Гав! Я " + name + "!");
        }

        public void info () {
            System.out.println("Имя: " + name + ", Возраст: " + age);
        }
    }
