import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;

public class CreateExamFromJson {

    public static Exam createExamFromJson (String json){
        Exam exam = new Exam();
        JsonElement jelement = new JsonParser().parse(json);
        JsonObject jobject = jelement.getAsJsonObject();
        JsonObject egzaminas = jobject.getAsJsonObject("exam");
        exam.setId(egzaminas.get("id").getAsInt());
        exam.setName(egzaminas.get("name").getAsString());
        exam.setType(egzaminas.get("type").getAsString());
        return exam;
    }

    public static List<ExamAnswer> createExamAnswersFromJson (String json){
        List<ExamAnswer> answers = new ArrayList<>();
        JsonElement jelement = new JsonParser().parse(json);
        JsonObject jobject = jelement.getAsJsonObject();
        JsonArray atsakymai = jobject.getAsJsonArray("answers");
        for (JsonElement ans: atsakymai) {
            ExamAnswer answer = new ExamAnswer();
            answer.setKlausimas(ans.getAsJsonObject().get("question").getAsInt());
            answer.setAtsakymas(ans.getAsJsonObject().get("answer").getAsString());
            answers.add(answer);
        }
        return answers;
    }
}
