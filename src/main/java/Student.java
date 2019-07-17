public class Student {

    private int id;
    private String name;
    private String lastName;
    private Exam exam;

    public Student(int id, String name, String lastName, Exam exam) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.exam = exam;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", exam=" + exam +
                '}';
    }
}
