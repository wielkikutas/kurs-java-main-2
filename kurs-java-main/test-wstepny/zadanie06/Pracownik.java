package zadanie06;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private int wiekrokuriooodaaenia;
    private int staz;
    private int id2;

    private static int index = 1;

    public Pracownik(String imie, String nazwisko, int wiekrokuriooodaaenia, int staz) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiekrokuriooodaaenia = wiekrokuriooodaaenia;
        this.staz = staz;
        this.id2 = index++;

    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiekrokuriooodaaenia=" + wiekrokuriooodaaenia +
                ", staz=" + staz +
                ", id2=" + id2 +
                '}';
    }
}
