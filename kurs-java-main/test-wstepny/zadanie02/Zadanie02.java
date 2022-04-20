package zadanie02;

/**
 * Napisz switch, który przyjmie liczbę reprezentującą ocenę z testu i dla danej oceny wypisz dany komunikat
 *
 * 2 - Nie zaliczyłeś
 * 3 - Zdałeś dostatecznie
 * 4 - Zdałeś dobrze
 * 5 - Zdałeś bardzo dobrze
 *
 * W przypadku innej oceny powinien zostać wypisany komunikat "Nierozpoznana ocena".
 */
public class Zadanie02 {
    public static void main(String[] args) {
        int ocena = 7;
        switch (ocena){
            case 1:
            case 2:
                System.out.println("nie zaliczyles");
                break;
            case 3:
                System.out.println("zdales");

            default:
                System.out.println("nierozpozbanba");
        }
    }
}
