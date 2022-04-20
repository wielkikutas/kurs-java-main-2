public class Zadanie05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilość elementów");
        int rozmiarTablicy = scanner.nextInt();
        int[] liczby = new int[rozmiarTablicy];
        for (int index = 0; index < rozmiarTablicy; index++) {
            System.out.println("Podaj liczbę numer " + (index + 1));
            int wczytanaLiczba = scanner.nextInt();
            liczby[index] = wczytanaLiczba;
        }
        for (int i = 0; i < liczby.length; i++) {
            System.out.print(liczby[i] + ", ");
        }
    }
}
