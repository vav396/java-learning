public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 40);
        person.introduce();

        Car myCar = new Car("Toyota", "Corolla", 2020);
        myCar.start();
        myCar.info();

        Student student1 = new Student("Alice",new int[]{4,5,3,4,5,3});
        student1.getAverageGrade();
        Student student2 = new Student("Alice",new int[]{4,5,3,4,5,3,4,5,3});
        student1.getAverageGrade();
    }
}