package inheritance;

public class Teacher extends Person{
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет и я преподаю " + subject);
    }
}
