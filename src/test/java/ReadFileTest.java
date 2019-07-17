import org.junit.Test;

import java.nio.file.NoSuchFileException;


public class ReadFileTest {

    @Test(expected = NoSuchFileException.class)
    public void fileExceptionTest() throws Exception {

        ReadFile readFile = new ReadFile();
        readFile.read("/Users/gretabaceviciute/IdeaProjects/ExamTestApp/src/main/resources/Attempt1.jso");
    }

}