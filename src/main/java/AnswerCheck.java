import java.util.List;

public class AnswerCheck {

    public int check(Exam exam, Student student) {
        int count = 0;
        List<ExamAnswer> correctAnswers = exam.getExamAnswers();
        List<ExamAnswer> studentAnswers = student.getExam().getExamAnswers();

        for (int i = 0; i < correctAnswers.size(); i++) {

            if (correctAnswers.get(i).getKlausimas() == studentAnswers.get(i).getKlausimas()
                    && correctAnswers.get(i).getAtsakymas().equals(studentAnswers.get(i).getAtsakymas())) {
                count++;
            }
        }
        return count * 10 / correctAnswers.size();
    }


}
