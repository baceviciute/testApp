import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StudentToWriteToFile {

    private int studentId;
    private String studentName;
    private String studentLastName;
    private int grade;
    private String date;

    public StudentToWriteToFile(int studentId, String studentName, String studentLastName, int grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentLastName = studentLastName;
        this.grade = grade;
        this.date = setDate();
    }

    public StudentToWriteToFile() {
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String setDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime now = LocalDateTime.now();
        String formatDateTime = now.format(formatter);
        this.date = formatDateTime;
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
