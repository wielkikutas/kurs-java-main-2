import java.util.Scanner;

public class Zadanie04 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę, którą mam zwiększać");
        Scanner scanner = new Scanner(System.in);
        int wczytanaLiczba = scanner.nextInt();
        int wczytanaLiczba2 = wczytanaLiczba;
        int wczytanaLiczba3 = wczytanaLiczba;

        System.out.println("Rozwiązanie z użyciem pętli while");
        while (wczytanaLiczba < 1000) {
            System.out.println(wczytanaLiczba);
            wczytanaLiczba *= 2;
        }

        System.out.println("Rozwiązanie z użyciem pętli for");
        System.out.println("Pierwszy sposób");
        for (int i = wczytanaLiczba2; i < 1000; i *= 2) {
            System.out.println(wczytanaLiczba2);
        }

        System.out.println("Drugi sposób");
        for (; wczytanaLiczba3 < 1000; wczytanaLiczba3 *= 2) {
            System.out.println(wczytanaLiczba3);
        }
    }
}
