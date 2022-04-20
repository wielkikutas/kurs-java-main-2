import java.util.Scanner;

/**
 * Wczytaj od użytkownika dwie liczby i wypisz ich
 * -sumę
 * -różnice
 * -iloraz
 * -iloczyn
 * Przykładowo dla sumy
 * "Suma dwóch liczb LICZBA1 oraz LICZBA2 wynosi SUMA"
 */
public class Zadanie02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe1");
        double liczba1 = scanner.nextDouble();
        System.out.println("Podaj liczbe2");
        double liczba2 = scanner.nextDouble();
        System.out.println("Suma dwóch liczb " + liczba1 + " oraz " + liczba2 + " wynosi " + (liczba1 + liczba2));
        double roznica = liczba1 - liczba2;
        System.out.println("Różnica dwóch liczb " + liczba1 + " oraz " + liczba2 + " wynosi " + roznica);
        double iloraz = liczba1 / liczba2;
        System.out.println("Iloraz dwóch liczb " + liczba1 + " oraz " + liczba2 + " wynosi " + iloraz);
        System.out.println("Iloczyn dwóch liczb " + liczba1 + " oraz " + liczba2 + " wynosi " + (liczba1 * liczba2));
    }
}
