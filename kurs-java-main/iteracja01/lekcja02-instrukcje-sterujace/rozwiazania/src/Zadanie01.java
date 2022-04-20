import java.util.Scanner;

public class Zadanie01 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int wczytanaLiczba = scanner.nextInt();
        if (wczytanaLiczba < 0) {
            System.out.println("Liczba jest ujemna");
        } else if (wczytanaLiczba == 0) {
            System.out.println("Liczba wynosi 0");
        } else {
            System.out.println("Liczba jest dodatnia");
        }
    }
}
