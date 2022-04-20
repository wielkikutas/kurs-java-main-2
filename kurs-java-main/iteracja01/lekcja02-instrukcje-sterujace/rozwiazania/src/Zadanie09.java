public class Zadanie09 {
    public static void main(String[] args) {
        int liczba1 = 5;
        int liczba2 = 15;
        int tmp = liczba1;
        liczba1 = liczba2;
        liczba2 = tmp;
        System.out.println("Liczba1 to teraz " + liczba1);
        System.out.println("Liczba2 to teraz " + liczba2);
    }
}
