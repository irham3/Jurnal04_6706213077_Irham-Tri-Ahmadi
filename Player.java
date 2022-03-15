public class Player {
    private String judulLagu;
    private String namaPenyanyi;

    public Player(String judulLagu, String namaPenyanyi) {
        this.judulLagu = judulLagu;
        this.namaPenyanyi = namaPenyanyi;
    }

    public String getJudulLagu() {
        return judulLagu;
    }

    @Override
    public String toString() {
        return judulLagu + '(' + namaPenyanyi + ')';
    }
}
