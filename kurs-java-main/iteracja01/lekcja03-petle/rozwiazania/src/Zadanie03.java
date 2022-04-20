import java.util.Scanner;

public class Zadanie03 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę, dla której mam obliczyć silnię");
        Scanner scanner = new Scanner(System.in);
        int wczytanaLiczba = scanner.nextInt();

        long silnia = 1;
        for (int i = 1; i <= wczytanaLiczba; i++) {
            silnia *= i;
            // powyższy zapis jest równoważny z zapisem
//            silnia = silnia * i;
        }
        System.out.println("Silnia z liczby " + wczytanaLiczba + " wynosi " + silnia);
    }
}
