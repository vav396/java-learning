package fundamentalsJava;

public class Person {
    private String name;
    private static int count = 0;

    public Person(String name) {
        this.name = name;
        count++;
    }
    public static void printCount(){
        System.out.println("Создано объектов Person: " +count);
    }
}
