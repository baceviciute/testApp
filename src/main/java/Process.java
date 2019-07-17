import java.util.ArrayList;
import java.util.List;

public class Process {

    private AnswerCheck answerCheck = new AnswerCheck();

    private ReadFile readFile = new ReadFile();

    private WriteToFile resultWriter = new WriteToFile();

    public void execute(String correctAnswers, String answersPath) {
        try {
            Exam exam = readFile.examFromFile(correctAnswers);

            Student student = readFile.StudentFromJson(answersPath);

            int examGrade = answerCheck.check(exam, student);

            StudentToWriteToFile studentResult = new StudentToWriteToFile(student.getId(), student.getName(), student.getLastName(), examGrade);

            if (resultWriter.resultsFileExists()) {

                List<StudentToWriteToFile> existingStudents = CreateExamResultsFromJson.studentsFromResultsFile("results.json");

                existingStudents.add(studentResult);
                ResultsToWriteToFile results = new ResultsToWriteToFile();
                List<ExamToWriteToFile> exams = new ArrayList<>();
                exams.add(new ExamToWriteToFile(exam.getId(), exam.getName(), existingStudents));
                results.setExams(exams);

                if (!resultWriter.finalCheckOfStudents(studentResult)) {

                    resultWriter.resultWriter(results);

                } else {
                    System.out.println("Given student already exists");
                }


            } else {

                List<StudentToWriteToFile> studentsWithGrades = new ArrayList<>();
                studentsWithGrades.add(studentResult);
                ResultsToWriteToFile results = new ResultsToWriteToFile();
                List<ExamToWriteToFile> exams = new ArrayList<>();
                exams.add(new ExamToWriteToFile(exam.getId(), exam.getName(), studentsWithGrades));
                results.setExams(exams);
                resultWriter.resultWriter(results);
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
