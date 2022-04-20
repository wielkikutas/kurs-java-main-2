package zadanie06;

/**
 * Napisz klasę Pracownik, która będzie przedstawiała pracownika dowolnej firmy. Każdy obiekt powinen przechowywać
 * takie informacje jak:
 * • imię
 * • nazwisko
 * • rok urodzenia
 * • staż pracy
 * • id, które będzie nadawane automatycznie począwszy od numeru 1
 *
 * W klasie Zadanie06 stwórz trzy obiekty reprezentujące pracowników, a następnie wypisz o nich informacje.
 */
public class Zadanie06 {
    public static void main(String[] args) {
    Pracownik pracownik1= new Pracownik("Maciej","Grzybowski",1999,2);
    Pracownik pracownik2= new Pracownik("dupa","podgrzybek  ",1929,32);
    Pracownik pracownik3= new Pracownik("cipa","muichomor",1989,21);
        System.out.println(pracownik1);
        System.out.println(pracownik2);
        System.out.println(pracownik3);

    }
}
