public class Zadanie04 {
    public static void main(String[] args) {
        int[] wszystkieLiczby = {23, 1, 92, -23, 123, 334, -231};

        System.out.println("1) liczby większe niż 69");
        for (int i = 0; i < wszystkieLiczby.length; i++) {
            if (wszystkieLiczby[i] > 69) {
                System.out.println(wszystkieLiczby[i]);
            }
        }
        System.out.println();

        int suma = 0;
        System.out.println("2) sumę wszystkich elementów tablicy");
        for (int i = 0; i < wszystkieLiczby.length; i++) {
            suma += wszystkieLiczby[i];
        }
        System.out.println(suma);
        System.out.println();

        System.out.println("3) największą liczbę");
        int max = wszystkieLiczby[0];
        for (int i = 0; i < wszystkieLiczby.length; i++) {
            if (wszystkieLiczby[i] > max) {
                max = wszystkieLiczby[i];
            }
        }
        System.out.println(max);
        System.out.println();

        System.out.println("4) liczby większe od średniej");
        double srednia = 1.0 * suma / wszystkieLiczby.length;
        for (int i = 0; i < wszystkieLiczby.length; i++) {
            if (wszystkieLiczby[i] > srednia) {
                System.out.println(wszystkieLiczby[i]);
            }
        }
        System.out.println();

        System.out.println("5) liczby, które są parzyste");
        for (int i = 0; i < wszystkieLiczby.length; i++) {
            if (wszystkieLiczby[i] % 2 == 0) {
                System.out.println(wszystkieLiczby[i]);
            }
        }
        System.out.println();

        System.out.println("6) liczby, znajdujące się na nieparzystym indeksie");
        for (int i = 0; i < wszystkieLiczby.length; i++) {
            if (i % 2 != 0) {
                System.out.println(wszystkieLiczby[i]);
            }
        }
        System.out.println();
    }
}
