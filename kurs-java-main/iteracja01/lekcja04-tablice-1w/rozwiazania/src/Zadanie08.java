public class Zadanie08 {
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

        String najdluzszy = szachisci[0];
        String najkrotszy = szachisci[0];

        for (int i = 0; i < szachisci.length; i++) {
            if (szachisci[i].length() > najdluzszy.length()) {
                najdluzszy = szachisci[i];
            }
            if (szachisci[i].length() < najkrotszy.length()) {
                najkrotszy = szachisci[i];
            }
            if (szachisci[i].length() == 11) {
                System.out.println("3) szachistę, którego imie i nazwisko ma długość 11 - " + szachisci[i]);
            }
        }

        System.out.println("1) szachistę, którego imie i nazwisko jest najkrótsze - " + najkrotszy);
        System.out.println("2) szachistę, którego imie i nazwisko jest najdłuższe - " + najdluzszy);
    }
}
