package zadanie04;

import java.util.Arrays;

/**
 *  Dana jest tablica:
 *  int [] wszystkieLiczby = {23, 1, 92, -23, 123, 334, -231};
 *  1) wypisz tylko liczby większe niż 4
 *  2) znajdź największy element
 *  3) wypisz elementy na nieparzystych indeksach
 */
public class Zadanie04 {
    public static void main(String[] args) {
        int [] wszystkieLiczby = {23, 1, 92, -23, 123, 334, -231};
        for (int i : wszystkieLiczby) {
            if (i>4){
                System.out.println(i);
            }

        }
        System.out.println("1) wypisz tylko liczby większe niż 4");

        System.out.println("2) znajdź największy element");

        int i1 = Arrays.stream(wszystkieLiczby).max().orElse(0);

        int max = Integer.MIN_VALUE;
        for (int i : wszystkieLiczby) {
            if (i>max){
                max=i;
            }
        }
        System.out.println(max);
        System.out.println("3) wypisz elementy na nieparzystych indeksach");
        for (int i = 1; i < wszystkieLiczby.length ; i+=2) {
            System.out.println(wszystkieLiczby[i]);

        }

    }
}
