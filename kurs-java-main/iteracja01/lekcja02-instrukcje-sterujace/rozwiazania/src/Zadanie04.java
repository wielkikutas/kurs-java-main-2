public class Zadanie04 {
    public static void main(String[] args) {
        int dzienTygodnia = 2;
        switch (dzienTygodnia) {
            case 1:
                System.out.println("Poniedzialek.");
                break;
            case 2:
                System.out.println("Wtorek.");
                break;
            case 3:
                System.out.println("Sroda.");
                break;
            case 4:
                System.out.println("Czwartek.");
                break;
            case 5:
                System.out.println("Piatek.");
                break;
            case 6:
                System.out.println("Sobota.");
                break;
            case 7:
                System.out.println("Niedziela.");
                break;
            default:
                System.out.println("Nieznany dzien tygodnia!");
        }
    }
}
