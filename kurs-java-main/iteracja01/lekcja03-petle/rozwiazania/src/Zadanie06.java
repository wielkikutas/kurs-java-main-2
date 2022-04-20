public class Zadanie06 {
    public static void main(String[] args) {
        System.out.println("Zadanie06");

        System.out.print("1) liczby większe niż 50 i podzielne przez 20");
        int suma = 0;
        for (int i = 33; i < 229; i++) {
            if (i > 50 && i % 20 == 0) {
                suma += i;
            }
        }
        System.out.println(" - ich suma wynosi " + suma);

        System.out.print("2) co piąta liczbę, która jest jednocześnie parzysta");
        suma = 0;
        for (int i = 33; i < 229; i += 5) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println(" - ich suma wynosi " + suma);


    }
}
