package inheritance;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
    }
}
