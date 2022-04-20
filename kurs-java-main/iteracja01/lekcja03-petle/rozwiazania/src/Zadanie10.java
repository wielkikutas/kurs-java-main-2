import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int wczytanaLiczba = scanner.nextInt();
        int iloscCyfr = 0;
        while (wczytanaLiczba > 0) {
            wczytanaLiczba /= 10;
            iloscCyfr++;
        }
        System.out.println("Liczba składa się z " + iloscCyfr + " cyfr");
    }
}
