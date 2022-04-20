package zadanie07;

public class Osoba {
    private String imie;
    private int rokUrodzenia;

    public Osoba(String imie, int rokUrodzenia) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }
    public Osoba(String imie) {
        this.imie = imie;
        this.rokUrodzenia = 1990;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", rokUrodzenia=" + rokUrodzenia +
                '}';
    }

    public String zwrocImie() {
        return imie;
    }
}
/**
        * Przygotuj klasę Osoba definiującą pola:
        *
        * • String imie,
        * • int rokUrodzenia
        * * • jednoargumentowy konstruktor, przyjmujący jako parametr String imie, natomiast jako pole rokUrodzenia
 *  *   przypisujący wartość 1990;
 **/