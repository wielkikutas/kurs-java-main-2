public class Zadanie05 {
    public static void main(String[] args) {
        int ocena = 7;
        switch (ocena) {
            case 2:
                System.out.println("Nie zaliczyłeś");
                break;
            case 3:
                System.out.println("Zdałes dostatecznie");
                break;
            case 4:
                System.out.println("Zdales dobrze");
                break;
            case 5:
                System.out.println("Zdales bardzo dobrze");
                break;
            default:
                System.out.println("Nierozpoznana ocena");
                break;
        }
    }
}
