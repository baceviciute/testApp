import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadFile {


    public Student StudentFromJson(String path) throws Exception {
        Student student = CreateStudentFromJson.createStudentFromJson(read(path));
        Exam exam = CreateStudentFromJson.createExamFromJson(read(path));

        List<ExamAnswer> examAnswersFromJson = CreateStudentFromJson.createExamAnswersFromJson(read(path));
        exam.setExamAnswers(examAnswersFromJson);
        student.setExam(exam);

        return student;
    }

    public Exam examFromFile(String path) throws Exception {
        Exam exam = CreateExamFromJson.createExamFromJson(read(path));
        List<ExamAnswer> examAnswersFromJson = CreateExamFromJson.createExamAnswersFromJson(read(path));
        exam.setExamAnswers(examAnswersFromJson);

        return exam;
    }

    public String read(String path) throws Exception {
        byte[] encoded = Files.readAllBytes(Paths.get(path));

        return new String(encoded);
    }
}
