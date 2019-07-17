import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Checker {

    public boolean checkExistingStudents(List<StudentToWriteToFile> studentsInFile, StudentToWriteToFile student) {

        Optional<StudentToWriteToFile> studentExists = studentsInFile.stream()
                .filter(stud -> student.getStudentId() == stud.getStudentId())
                .findFirst();

        return studentExists.isPresent();
    }


    public List<StudentToWriteToFile> existingStudents(String json) {
        List<StudentToWriteToFile> studentsInFile = new ArrayList<>();
        JsonElement jelement = new JsonParser().parse(json);
        JsonObject jobject = jelement.getAsJsonObject();
        JsonArray studentsList = jobject.getAsJsonArray("exams").get(0).getAsJsonObject().get("examResults").getAsJsonArray();
        for (JsonElement studentInFile : studentsList) {
            StudentToWriteToFile student = new StudentToWriteToFile();
            student.setStudentId(studentInFile.getAsJsonObject().get("studentId").getAsInt());
            studentsInFile.add(student);
        }
        return studentsInFile;
    }


//    public boolean checkExistingExams (List <ExamToWriteToFile> examsInFile, ExamToWriteToFile exam){
//        Optional <ExamToWriteToFile> examExists = examsInFile.stream()
//            .filter(ex -> exam.getExamId() == ex.getExamId())
//                .findFirst();
//        if(examExists.isPresent()){
//            return true;
//        }else {
//            return false;
//        }
//    }


//    public List<ExamToWriteToFile> existingExams (String json){
//        List<ExamToWriteToFile> examsInFile = new ArrayList<>();
//        JsonElement jelement = new JsonParser().parse(json);
//        JsonObject jobject = jelement.getAsJsonObject();
//        JsonArray examsList = jobject.getAsJsonArray("exams");
//        for (JsonElement examInFile : examsList){
//            ExamToWriteToFile exam = new ExamToWriteToFile();
//            exam.setExamId(examInFile.getAsJsonObject().get("examId").getAsInt());
//            exam.setExamName(examInFile.getAsJsonObject().get("examName").getAsString());
//            examsInFile.add(exam);
//        }
//        return examsInFile;
//    }


}
