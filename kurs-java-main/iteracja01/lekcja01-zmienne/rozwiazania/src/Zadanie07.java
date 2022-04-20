import java.util.Scanner;

/**
 * Napisz program, który wczyta od użytkownika do zmiennej godzinę oraz minutę i wypisze ile to sekund.
 */
public class Zadanie07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj godzinę");
        int godziny = scanner.nextInt();
        System.out.println("Podaj minuty");
        int minuty = scanner.nextInt();
        int sekundy = (godziny * 60 + minuty) * 60;
        System.out.println("Ilość sekund to " + sekundy);
    }
}
