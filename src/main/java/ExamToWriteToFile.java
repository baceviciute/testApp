import java.util.List;

public class ExamToWriteToFile {

    private int examId;
    private String examName;

    private List <StudentToWriteToFile> examResults;

    public ExamToWriteToFile() {
    }

    public ExamToWriteToFile(int examId, String examName, List<StudentToWriteToFile> studentToWriteToFiles) {
        this.examId = examId;
        this.examName = examName;
        this.examResults = studentToWriteToFiles;
    }

    public List<StudentToWriteToFile> getExamResults() {
        return examResults;
    }

    public void setExamResults(List<StudentToWriteToFile> examResults) {
        this.examResults = examResults;
    }

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public int getExamId() {
        return examId;
    }

    public String getExamName() {
        return examName;
    }
}
