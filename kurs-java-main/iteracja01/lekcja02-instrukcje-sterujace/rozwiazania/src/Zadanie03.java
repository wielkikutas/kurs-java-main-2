import java.util.Scanner;

public class Zadanie03 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int wczytanaLiczba = scanner.nextInt();
        if (wczytanaLiczba % 2 == 0) {
            System.out.println("Liczba jest parzysta!");
        } else {
            System.out.println("Liczba nie jest parzysta");
        }

    }
}
