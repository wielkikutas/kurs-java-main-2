public class Zadanie07 {
    public static void main(String[] args) {
        int wylosowana = (int) ((Math.random() * (1000 - 1)) + 1);
        int min = wylosowana;
        int max = wylosowana;
        double srednia = wylosowana;
        for (int i = 0; i < 99; i++) {
            wylosowana = (int) ((Math.random() * (1000 - 1)) + 1);
            if (wylosowana > max) {
                max = wylosowana;
            }
            if (wylosowana < min) {
                min = wylosowana;
            }
            srednia += wylosowana;
        }
        System.out.println("Największa wylosowana liczba wynosi " + max);
        System.out.println("Najmniejsza wylosowana liczba wynosi " + min);
        System.out.println("Średnia wylosowanych liczba wynosi " + srednia / 100);
    }
}
