package fundamentalsJava.method1.Practic;

public class StudentService {
    private int studentCount = 0;
    private int totalScore = 0;
    private String bestStudent = "";
    private String worstStudent = "";
    private int maxScore = 0;
    private int minScore = 0;

    public void addStudent(Student student, int score) {
        if (studentCount == 0) {
            bestStudent = student.getName();
            worstStudent = student.getName();
            maxScore = score;
            minScore = score;
        } else {
            if (score > maxScore) {
                bestStudent = student.getName();
                maxScore = score;
            } else if (score < minScore) {
                worstStudent = student.getName();
                minScore = score;
            }
        }
        totalScore += score;
        studentCount++;
    }

    public float getAverageScore() {
        if (studentCount == 0) {
            return 0;
        } else {
            return (float) totalScore / studentCount;
        }
    }
    public String getBestStudent() {
        if (studentCount == 0) {
            return "";
        } else {
            return bestStudent;
        }
    }
    public String getWorstStudent() {
        if (studentCount == 0) {
            return "";
        } else {
            return worstStudent;
        }
    }

}
