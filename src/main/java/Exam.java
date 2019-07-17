import java.util.List;

public class Exam {

    private int id;
    private String name;
    private String type;

    private List<ExamAnswer> examAnswers;

    public Exam(int id, String name, String type, List<ExamAnswer> examAnswers) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.examAnswers = examAnswers;
    }

    public Exam() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setExamAnswers(List<ExamAnswer> examAnswers) {
        this.examAnswers = examAnswers;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<ExamAnswer> getExamAnswers() {
        return examAnswers;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", examAnswers=" + examAnswers +
                '}';
    }
}

