public class Zadanie06 {
    public static void main(String[] args) {
        int[] losoweLiczby = {1, -19, 10, 100, 900, -1800, 837};

        int najwiekszy = losoweLiczby[0];
        int najmniejszy = losoweLiczby[0];
        double suma = 0;

        for (int i = 0; i < losoweLiczby.length; i++) {
            suma += losoweLiczby[i];
            if (losoweLiczby[i] > najwiekszy) {
                najwiekszy = losoweLiczby[i];
            }
            if (losoweLiczby[i] < najmniejszy) {
                najmniejszy = losoweLiczby[i];
            }
        }

        double srednia = suma / losoweLiczby.length;

        System.out.println("Najwieksza liczba to " + najwiekszy);
        System.out.println("Najmniejsza liczba to " + najmniejszy);
        System.out.println("Liczby większe niż srednia, która wynosi " + srednia);

        for (int i = 0; i < losoweLiczby.length; i++) {
            if (losoweLiczby[i] > srednia) {
                System.out.println(losoweLiczby[i]);
            }
        }
    }
}
