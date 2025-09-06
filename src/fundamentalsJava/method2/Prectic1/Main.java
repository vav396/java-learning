package fundamentalsJava.method2.Prectic1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", 25);
        Person person2 = new Person("Ivan", 25);
        Person person3 = new Person("Macha", 30);

        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

        Person.name = "Masha";
        System.out.println(Person.name);
    }
}
