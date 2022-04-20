import java.util.Scanner;

/**
 * Wczytaj od użytkownika imię oraz wiek, a następnie wyświetl komunikat
 * "Osoba o imieniu IMIE ma X lat"
 */
public class Zadanie01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię");
        String imie = scanner.nextLine();
        System.out.println("Podaj wiek");
        int wiek = scanner.nextInt();
        System.out.println("Osoba o imieniu " + imie + " ma " + wiek + " lat");
    }
}
