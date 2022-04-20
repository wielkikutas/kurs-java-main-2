package zadanie05;

/**
 * Dana jest tablica typu String przechowująca najlepszych 13 szachistów (styczeń 2022). Znajdz i wypisz
 *
 * 1) Szachistę, którego imie i nazwisko jest najkrótsze
 * 2) Szachistę, którego imie i nazwisko jest najdłuższe
 * 3) Szachistę, którego imie i nazwisko ma długość 11
 */
public class Zadanie05 {
    public static void main(String[] args) {
        String[] szachisci = {
                "Carlsen, Magnus",
                "Firouzja, Alireza",
                "Ding, Liren",
                "Caruana, Fabiano",
                "Nepomniachtchi, Ian",
                "Aronian, Levon",
                "Giri, Anish",
                "So, Wesley",
                "Mamedyarov, Shakhriyar",
                "Grischuk, Alexander",
                "Rapport, Richard",
                "Vachier-Lagrave, Maxime",
                "Duda, Jan-Krzysztof",
        };
        System.out.println("1) Szachistę, którego imie i nazwisko jest najkrótsze");
        int dlugosc=0;
        String najdluzszy="";
        for (String s : szachisci) {
            if (s.length()>najdluzszy.length()){
                najdluzszy=s;

            }
        }
        System.out.println(najdluzszy);

        System.out.println("2) Szachistę, którego imie i nazwisko jest najdłuższe");
        String najkrutszy ="Carlsen, Magnus";
        for (String s : szachisci) {
            if (s.length()<najkrutszy.length()){
                najkrutszy=s;
            }
        }
        System.out.println(najkrutszy);

        System.out.println("3) Szachistę, którego imie i nazwisko ma długość 11");
        for (String s : szachisci) {
            if (s.length()==11){
                System.out.println(s);
            }
        }
    }
}
