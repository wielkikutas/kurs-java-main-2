public class Zadanie13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj podstawę potęgi");
        int podstawaPotegi = scanner.nextInt();
        System.out.println("Podaj wykładnik");
        int wykladnik = scanner.nextInt();
        int wynik = 1;
        for (int i = 0; i < wykladnik; i++) {
            wynik *= podstawaPotegi;
        }
        System.out.println("Wynik potęgowania wynosi " + wynik);
    }
}
