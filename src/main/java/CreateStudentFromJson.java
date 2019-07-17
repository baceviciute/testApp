import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class CreateStudentFromJson extends CreateExamFromJson {

    public static Student createStudentFromJson(String json){
        Student student = new Student();
        JsonElement jelement = new JsonParser().parse(json);
        JsonObject jobject = jelement.getAsJsonObject();
        JsonObject studentas = jobject.getAsJsonObject("student");
        student.setId(studentas.get("id").getAsInt());
        student.setName(studentas.get("name").getAsString());
        student.setLastName(studentas.get("lastName").getAsString());
        return student;
    }

}
