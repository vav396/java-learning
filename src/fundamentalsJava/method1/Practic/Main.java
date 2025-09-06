package fundamentalsJava.method1.Practic;

public class Main {
    public static void main(String[] args) {
       StudentService studentService = new StudentService();

       studentService.addStudent(new Student("John", 11),60);
       studentService.addStudent(new Student("dacha", 3),70);
       studentService.addStudent(new Student("Ivan", 5),80);

        System.out.println(studentService.getAverageScore());
        System.out.println(studentService.getBestStudent());
        System.out.println(studentService.getWorstStudent());
    }
}
