public class Zadanie12 {
    public static void main(String[] args) {
        int liczby [] = {11, 10, 93, 43, 23, 56, 88, 72, 19, 99};
        for (int i = 0; i < liczby.length; i++) {
            int dziesiatki = liczby[i] / 10;
            int jednosci = liczby[i] % 10;
            if (jednosci > dziesiatki) {
                System.out.println(liczby[i]);
            }
        }
    }
}
