import java.util.Scanner;

/**
 * Napisz program, który konwertuje temperaturę wyrażoną w stopniach Celsjusza na skalę Fahrenheita.
 * Powinien on:
 * 1) prosić użytkownika o wprowadzenie danych
 * 2) odczytać wartość typu double z klawiatury
 * 3) obliczyć wynik
 * 4) wypisać wynik w postaci
 */
public class Zadanie08 {
    public static void main(String[] args) {
        System.out.println("Podaj temperaturę wyrażoną w stopniach Celsjusza");
        Scanner scanner = new Scanner(System.in);
        double temperaturaCelsjusz = scanner.nextDouble();
        double temperaturaFahrenheit = temperaturaCelsjusz * (9/5.0) + 32;
        System.out.println(temperaturaCelsjusz + " C = " + temperaturaFahrenheit + " F");
    }
}
