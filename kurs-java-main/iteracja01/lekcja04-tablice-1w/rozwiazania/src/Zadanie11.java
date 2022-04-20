public class Zadanie11 {
    public static void main(String[] args) {
        int tab1 [] = {1, 2, 3};
        int tab2 [] = {9, 8, 7};
        int suma = 0;
        for (int i = 0; i < tab1.length; i++) {
            suma += tab1[i] + tab2[i];
        }
        System.out.println("Suma wynosi " + suma);
    }
}
