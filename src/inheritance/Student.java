package inheritance;

public class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void introduce() {
        System.out.println("Привет меня зовут " + name + ", мне " + age + " лет и я учусь в " + grade + " классе");
    }
}
