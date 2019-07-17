import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFile {

    public String fileName = "results.json";
    public Path resultFile = Paths.get(fileName);
    public Checker checker = new Checker();

    public void resultWriter(Object object) throws Exception {

        if (!Files.exists(resultFile)) {
            Files.createFile(resultFile);
        }

        try (FileWriter file = new FileWriter(resultFile.toString())) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(object);
            file.write(json);
        }
    }

    public boolean resultsFileExists() {

        return Files.exists(resultFile);
    }

    public boolean finalCheckOfStudents(StudentToWriteToFile student) throws Exception {

        checker.existingStudents(new ReadFile().read("results.json"));
        boolean check = checker.checkExistingStudents(checker.existingStudents(new ReadFile().read(resultFile.toString())), student);

        return check;
    }

//    // gal nereikia tokio metodo, jei bus paduodamas tik vienas egzaminas
//    public boolean finalCheckOfExams(ExamToWriteToFile exam) throws Exception {
//        checker.existingExams(new ReadFile().read("results.json"));
//        boolean check = checker.checkExistingExams(checker.existingExams(new ReadFile().read(resultFile.toString())), exam);
//
//        return check;
//    }


}

