public class Main {

    public static void main(String[] args) {

        String correctAnswers = args[0];
        String answersPath = args[1];

        new Process().execute(correctAnswers, answersPath);

    }
}
