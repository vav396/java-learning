public class Student {

    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades.clone();
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
        this.name = name;
    } else {
            System.out.println("Имя не может быть пустым");
        }
    }

    public void setGrades(int[] grades) {
        if (grades != null && grades.length > 0) {
            for (int grade : grades) {
                if (grade < 1 || grade > 5) {
                    System.out.println("Оценка " + grade + " не может быть меньше 1 или больше 5");
                    return;
                }
            }
            this.grades = grades;
        }
    }

    public double getAverageGrade() {
            double sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return sum / grades.length;

    }
}
