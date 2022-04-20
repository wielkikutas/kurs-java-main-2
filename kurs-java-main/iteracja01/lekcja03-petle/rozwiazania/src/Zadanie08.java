import java.util.Scanner;

public class Zadanie08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int liczba;
        do {
            System.out.println("Podaj liczbę ");
            liczba = scanner.nextInt();
        } while (liczba != 0);
        System.out.println("Program się zakończył, podałeś liczbę 0");
    }
}
