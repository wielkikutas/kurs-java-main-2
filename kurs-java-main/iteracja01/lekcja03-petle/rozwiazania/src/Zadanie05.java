import java.util.Scanner;

public class Zadanie05 {
    public static void main(String[] args) {
        System.out.println("Zgadnij liczbę");
        final int wartoscPoczatkowa = 500;

        Scanner scanner = new Scanner(System.in);
        int wczytanaLiczba;
        while ((wczytanaLiczba = scanner.nextInt()) != wartoscPoczatkowa) {
            if (wczytanaLiczba > wartoscPoczatkowa) {
                System.out.println("Podana liczba jest za duża, zgaduj dalej!");
            } else {
                System.out.println("Podana liczba jest za mała, zgaduj dalej!");
            }
        }

        System.out.println("Brawo, zgadłeś!");

        scanner.close();
    }
}
