import java.util.Arrays;

public class Student {

    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        setGrades(grades); // используем сеттер с проверкой оценок
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Имя не может быть пустым");
        }
    }

    public int[] getGrades() {
        return Arrays.copyOf(grades, grades.length);
    }

    public void setGrades(int[] grades) {
        if (grades == null) {
            System.out.println("Массив оценок не может быть null");
            return;
        }

        for (int grade : grades) {
            if (grade < 1 || grade > 5) {
                System.out.println("Оценка " + grade + " некорректна");
                return;
            }
        }
        this.grades = grades.clone();
    }

    public double getAverageGrade() {
        if (grades.length == 0) return 0.0;

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public void printInfo() {
        double avg = getAverageGrade();
        System.out.println("Студент: " + name + ", Средний балл: " + avg);
    }
}

