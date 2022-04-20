package zadanie09;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

/**
 * Stwórz interfejs Obliczanie, który będzie posiadał następujące metody
 * <p>
 * • double obliczPole()
 * • double obliczObwod()
 * <p>
 * Następnie zaimplementuj go w klasach:
 * • Kwadrat
 * • Prostokąt
 * • Koło.
 * <p>
 * Niech każda klasa w konstruktorze przyjmuje niezbędne dane do obliczenia pola oraz obwodu. Stwórz po jednej
 * instancji każdej klasy, następnie za pomocą pętli wypisz pole i obwód każdej figury np.
 * ”Koło: obwód - X, pole - Y”
 * <p>
 * Napisz metodę w interfejsie obliczanie, którą będzie można wywołać bez obiektu danej klasy.
 * Przyjmie ona listę dowolnych figur i zwróci tą, której pole jest największe.
 * <p>
 * Do obliczenia pola koła będzie potrzebna liczba PI, użyj stałej dostępnej w bibliotece math.
 */
public class
Zadanie09 {
    public static void main(String[] args) {
        Kolo k1 = new Kolo(1);
        Kwadrat kw1 = new Kwadrat(2);
        Prostokont p1 = new Prostokont(2, 3);
        List<Obliczanie> obliczanko = List.of(k1, kw1, p1);
        for (Obliczanie obliczanie : obliczanko) {
            System.out.print(obliczanie.getType() + ": ");
            System.out.print("obwód: " + obliczanie.obliczObwod());
            System.out.println("pole: " + obliczanie.obliczPole());
        }
    }
    public static Obliczanie znajdznajwieknkoszom(List<Obliczanie>obliczanies){
        Obliczanie takaDOprzechowywania=null;
        for (Obliczanie obliczany : obliczanies) {
            if (takaDOprzechowywania==null||obliczany.obliczPole()>takaDOprzechowywania.obliczPole()){
                takaDOprzechowywania=obliczany;
            }
        }
        return takaDOprzechowywania;

    }

}
