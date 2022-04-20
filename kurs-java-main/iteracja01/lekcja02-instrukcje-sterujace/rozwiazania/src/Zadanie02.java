import java.util.Scanner;

public class Zadanie02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // gorsze rozwiazanie
        int wczytanaLiczba = scanner.nextInt();
        if (wczytanaLiczba > 100) {
            if (wczytanaLiczba < 500) {
                System.out.println("poprawna");
            } else {
                System.out.println("niepoprawna");
            }
        }

        // lepsze rozwiązanie
        if (wczytanaLiczba > 100 && wczytanaLiczba < 500) {
            System.out.println("poprawna");
        }
    }
}
