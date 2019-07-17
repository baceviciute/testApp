import org.junit.Assert;
import org.junit.Test;


public class CreateStudentFromJsonTest {

    @Test
    public void studentTest() throws Exception {
        CreateStudentFromJson createStudent = new CreateStudentFromJson();
        ReadFile readFile = new ReadFile();
        Student student = createStudent.createStudentFromJson(readFile.read("/Users/gretabaceviciute/IdeaProjects/ExamTestApp/src/test/resources/Attempt1.json"));
        Assert.assertEquals(122, student.getId());
        Assert.assertEquals("Ona", student.getName());
    }

}