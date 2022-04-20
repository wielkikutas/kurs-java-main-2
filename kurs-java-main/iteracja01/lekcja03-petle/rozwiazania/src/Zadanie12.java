import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj napis, który chcesz sprawdzić");
        String wczytanyNapis = scanner.nextLine();
        boolean czyPalindrom = true;
        for (int przod = 0, tyl = wczytanyNapis.length() - 1; przod < wczytanyNapis.length(); przod++, tyl--) {
            if (wczytanyNapis.charAt(przod) != wczytanyNapis.charAt(tyl)) {
                czyPalindrom = false;
                break;
            }
        }
        System.out.println(czyPalindrom);
    }
}
