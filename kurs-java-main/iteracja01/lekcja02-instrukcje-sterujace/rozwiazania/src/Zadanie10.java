import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoją temperaturę");
        int temperature = scanner.nextInt();
        if (temperature < 36) {
            System.out.println("Jesteś osłabiony?");
        } else if (temperature < 37) {
            System.out.println("Wszystko w normie!");
        } else if (temperature < 38) {
            System.out.println("Jesteś przeziębiony?");
        } else {
            System.out.println("Masz co najmniej 38 stopni! Biegiem do lekarza!");
        }
    }
}
