package zadanie07;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Przygotuj klasę Osoba definiującą pola:
 * <p>
 * • String imie,
 * • int rokUrodzenia
 * <p>
 * Klasa będzie również definiować:
 * <p>
 * • dwuargumentowy konstruktor, inicjujący pola klasy;
 * • jednoargumentowy konstruktor, przyjmujący jako parametr String imie, natomiast jako pole rokUrodzenia
 * przypisujący wartość 1990;
 * • metodę zwrocImie() zwracającą wartość pola imie;
 * • metodę zwrocWiek() zwracającą wiek osoby;
 * • metodę zwrocStarszaOsobe przyjmującą w liście argumentów dwa obiekt klasy Osoba
 * i zwracającą starszą osobę;
 * • statyczną metodę zwrocNajstarszaOsobe przyjmującą jako argument tablicę obiektów klasy Osoba
 * i zwracającą najstarszą osobę.
 * <p>
 * W klasie Main stwórz kilka obiektów i przetestuj wszystkie metody.
 */
public class Zadanie07 {
    public static void main(String[] args) {
        Osoba dupa1 = new Osoba("MAciek", 1);
        Osoba dupa2 = new Osoba("Masdfaek", 241);
        findOlderPerson(dupa1, dupa2);
        System.out.println(dupa1.zwrocImie());
        System.out.println(LocalDate.now().getYear() - dupa1.getRokUrodzenia());
        List<Osoba> listaOsob = List.of(dupa1, dupa2);
        System.out.println(zwrocNajstarszaOsobe(listaOsob));
    }

    private static Osoba findOlderPerson(Osoba o1, Osoba o2) {
        if (o1.getRokUrodzenia() > o2.getRokUrodzenia()) {
            return o2;
        }
        if (o1.getRokUrodzenia() < o2.getRokUrodzenia()) {
            return o1;
        }
        return null;
    }

    private static Osoba zwrocNajstarszaOsobe(List<Osoba> listaOsob) {
        Osoba najstarsza = null;
        for (Osoba osoba : listaOsob) {

            if (najstarsza == null || osoba.getRokUrodzenia() < najstarsza.getRokUrodzenia()) {
                najstarsza = osoba;
            }
        }
return najstarsza;
    }
}
