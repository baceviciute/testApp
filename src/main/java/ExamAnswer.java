public class ExamAnswer {

    private int klausimas;
    private String atsakymas;

    public ExamAnswer(int klausimas, String atsakymas) {
        this.klausimas = klausimas;
        this.atsakymas = atsakymas;
    }

    public ExamAnswer() {
    }

    public int getKlausimas() {
        return klausimas;
    }

    public String getAtsakymas() {
        return atsakymas;
    }

    public void setKlausimas(int klausimas) {
        this.klausimas = klausimas;
    }

    public void setAtsakymas(String atsakymas) {
        this.atsakymas = atsakymas;
    }

    @Override
    public String toString() {
        return "ExamAnswer{" +
                "klausimas=" + klausimas +
                ", atsakymas='" + atsakymas + '\'' +
                '}';
    }
}
