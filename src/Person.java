public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Привет, меня зовут " + name + ", мне " + age + " лет.");
    }
}
