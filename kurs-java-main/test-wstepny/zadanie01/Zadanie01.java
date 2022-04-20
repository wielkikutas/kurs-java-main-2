package zadanie01;

import java.util.Scanner;

/**
 * Napisz program wypisujący true, gdy wczytana od użytkownika liczba typu int jest większa niż 100 oraz mniejsza
 * bądź równa 500.
 */
public class Zadanie01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dupa = scanner.nextInt();
        if (dupa <= 500 && dupa > 100) {
            System.out.println(true);
        }

    }
}
