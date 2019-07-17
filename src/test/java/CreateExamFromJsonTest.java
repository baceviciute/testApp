import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CreateExamFromJsonTest {

    private CreateExamFromJson createExam = new CreateExamFromJson();
    private ReadFile readFile = new ReadFile();

    @Test
    public void examCreationTest() throws Exception {
        Exam exam = createExam.createExamFromJson(readFile.read("/Users/gretabaceviciute/IdeaProjects/ExamTestApp/src/test/resources/ExamCorrectAnswers.json"));

        Assert.assertEquals(1, exam.getId());
        Assert.assertEquals("OOP pagrindai", exam.getName());
    }

    @Test
    public void examAnswersCreationTest () throws Exception {
        List<ExamAnswer> examAnswers = createExam.createExamAnswersFromJson(readFile.read("/Users/gretabaceviciute/IdeaProjects/ExamTestApp/src/test/resources/ExamCorrectAnswers.json"));

        Assert.assertEquals(10, examAnswers.size());

    }

}