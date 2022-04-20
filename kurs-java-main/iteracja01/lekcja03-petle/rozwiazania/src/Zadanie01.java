public class Zadanie01 {
    public static void main(String[] args) {
        System.out.println("Zadanie 1 - for");
        System.out.println("1) wyświetli wartości od 1 do 10 (włącznie)");
        for (int i = 1; i < 11; i++) { // warunek mógłby wyglądać również tak -> i <= 10
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println("2) wyświetli wartości od 10 do 1 (włącznie)");
        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Zadanie 1 - while");
        System.out.println("1) wyświetli wartości od 1 do 10 (włącznie)");
        int licznik = 1;
        while (licznik <= 10) { // warunek mógłby wyglądać również tak -> licznik < 11
            System.out.print(licznik + " ");
            licznik++;
        }
        System.out.println();

        System.out.println("2) wyświetli wartości od 10 do 1 (włącznie)");
        licznik = 10;
        while (licznik > 0) {
            System.out.print(licznik + " ");
            licznik--;
        }
    }
}
