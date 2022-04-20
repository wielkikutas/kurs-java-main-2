public class Zadanie08 {
    public static void main(String[] args) {
        int rok = 2000;
        if (rok >= 1 && rok <= 9999) {
            if ((rok % 400 == 0) || (rok % 100 != 0 && rok % 4 == 0)) {
                System.out.println("Jest przestępny");
            }
        }
    }
}
