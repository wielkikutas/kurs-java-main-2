public class Zadanie07 {
    public static void main(String[] args) {
        int[] wartosci = {1, 8, 10, 11, 20, 22, 19, 100, 99, 188};
        int licznik = 0;
        boolean wypisana = false;
        for (int i = 0; i < wartosci.length; i++) {
            if (wartosci[i] % 2 == 0) {
                licznik++;
            }
            if (licznik == 5 && !wypisana) {
                wypisana = true;
                System.out.println("Piąta parzysta liczba to " + wartosci[i]);
            }
        }
    }
}
