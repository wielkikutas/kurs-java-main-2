import java.util.Scanner;

public class Zadanie09 {
    public static void main(String[] args) {
        System.out.println("Podaj wyraz, który mam wypisać w odwrotnej kolejności");
        Scanner scanner = new Scanner(System.in);
        String wczytanyTekst = scanner.nextLine();
        for (int i = wczytanyTekst.length() - 1; i >= 0; i--) {
            System.out.print(wczytanyTekst.charAt(i));
        }
    }
}
