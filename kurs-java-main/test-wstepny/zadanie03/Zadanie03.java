package zadanie03;

/**
 * Zsumuj wszystkie liczby od 0 do 997 i wyświetli wynik na konsoli. Zadanie zrób używając pętli
 * • for
 * • while
 * • do-while
 */
public class Zadanie03 {
    public static void main(String[] args) {
        int dupa1 = 0;
        System.out.println("Pętla for");
        for (int i = 0; i < 998; i++) {
            dupa1 += i;


        }
        System.out.println(dupa1);
        System.out.println("Pętla while");
        int j = 0;
        dupa1 = 0;
        while (j < 997) {
            j++;
            dupa1 += j;
        }
        System.out.println(dupa1);
        System.out.println("Pętla do-while");
        dupa1 = 0;
        j = 0;
        do {
            j++;
            dupa1 += j;
        }while (j<997);
        System.out.println(dupa1);
    }
}
