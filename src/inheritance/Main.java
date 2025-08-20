package inheritance;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Алекс", 14);
        Student student = new Student("Андрей", 14,9);
        Teacher teacher = new Teacher("Юля", 14, "Математика");

        person.introduce();
        student.introduce();
        teacher.introduce();
    }
}
