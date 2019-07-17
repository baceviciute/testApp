import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckerTest {

    private Checker checker = new Checker();

    @Test
    public void throwsTrueWhenStudentExistsInListTest() {
        List<StudentToWriteToFile> studentList = new ArrayList<>();
        studentList.add(createStudent(2));
        StudentToWriteToFile student2 = createStudent(2);

        Assert.assertTrue(checker.checkExistingStudents(studentList, student2));
    }

    @Test
    public void throwsFalseWhenStudentDoesntExistsInListTest() {
        List<StudentToWriteToFile> studentList = new ArrayList<>();
        studentList.add(createStudent(2));
        StudentToWriteToFile student2 = createStudent(4);

        Assert.assertFalse(checker.checkExistingStudents(studentList, student2));
    }


    private StudentToWriteToFile createStudent(int id) {

        StudentToWriteToFile student = new StudentToWriteToFile();
        student.setStudentId(id);

        return student;
    }
}
