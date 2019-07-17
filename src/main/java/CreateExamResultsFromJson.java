import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;

public class CreateExamResultsFromJson {

    public static List<StudentToWriteToFile> studentsFromResultsFile(String path) throws Exception {
        ReadFile readFile = new ReadFile();

        ExamToWriteToFile examToWriteToFile = CreateExamResultsFromJson.createExistingResultsObject(readFile.read(path));

        return examToWriteToFile.getExamResults();
    }


    public static ExamToWriteToFile createExistingResultsObject(String json) {
        ExamToWriteToFile examsFromJson = new ExamToWriteToFile();
        List<StudentToWriteToFile> resultsListJson = new ArrayList<>();
        JsonElement jelement = new JsonParser().parse(json);
        JsonObject jobject = jelement.getAsJsonObject();
        JsonArray a = jobject.getAsJsonArray("exams").get(0).getAsJsonObject().get("examResults").getAsJsonArray();
        for (JsonElement stud : a) {
            StudentToWriteToFile student = new StudentToWriteToFile();
            student.setStudentId(stud.getAsJsonObject().get("studentId").getAsInt());
            student.setStudentName(stud.getAsJsonObject().get("studentName").getAsString());
            student.setStudentLastName(stud.getAsJsonObject().get("studentLastName").getAsString());
            student.setGrade(stud.getAsJsonObject().get("grade").getAsInt());
            student.setDate(stud.getAsJsonObject().get("date").getAsString());
            resultsListJson.add(student);
        }
        examsFromJson.setExamResults(resultsListJson);

        return examsFromJson;
    }
}
