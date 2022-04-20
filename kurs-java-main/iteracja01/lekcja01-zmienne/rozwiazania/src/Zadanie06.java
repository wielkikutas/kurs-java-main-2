/**
 * Napisz program, który wypisze resztę z dzielenia zmiennej liczba1 przez liczba2. Program powinien wypisać
 * podobny komunikat do poniższego:
 * "Reszta z dzielenia LICZBA1 przez LICZBA2 wynosi X"
 */
public class Zadanie06 {
    public static void main(String[] args) {
        int liczba1 = 20;
        int liczba2 = 3;
        int reszta = liczba1 % liczba2;
        System.out.println("Reszta z dzielenia " + liczba1 + " przez " + liczba2 + " wynosi " + reszta);
    }
}
