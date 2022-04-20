import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst;
        do {
            System.out.println("Podaj napis");
            tekst = scanner.nextLine();
        } while (!"KONIEC".equals(tekst));
    }
}
