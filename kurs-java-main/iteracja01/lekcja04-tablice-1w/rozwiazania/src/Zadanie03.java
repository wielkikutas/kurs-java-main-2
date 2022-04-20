public class Zadanie03 {
    public static void main(String[] args) {
        String[] dniTygdodnia = new String[7];
        dniTygdodnia[0] = "Poniedziałek";
        dniTygdodnia[1] = "Wtorek";
        dniTygdodnia[2] = "Środa";
        dniTygdodnia[3] = "Czwartek";
        dniTygdodnia[4] = "Piątek";
        dniTygdodnia[5] = "Sobota";
        dniTygdodnia[6] = "Niedziela";

        System.out.println("1) od przodu");
        for (int i = 0; i < dniTygdodnia.length; i++) {
            System.out.println(dniTygdodnia[i]);
        }
        System.out.println();

        System.out.println("2) od tyłu");
        for (int i = dniTygdodnia.length - 1; i >= 0; i--) {
            System.out.println(dniTygdodnia[i]);
        }
        System.out.println();

        System.out.println("3) od przodu, ale tylko te na parzystych indeksach");
        for (int i = 0; i < dniTygdodnia.length; i+=2) {
            System.out.println(dniTygdodnia[i]);
        }
        System.out.println();

        System.out.println("4) kończące się na literę 'k'");
        for (int i = 0; i < dniTygdodnia.length; i++) {
            if (dniTygdodnia[i].endsWith("k")) {
                System.out.println(dniTygdodnia[i]);
            }
        }
        System.out.println();

        System.out.println("5) zawierające w sobie ciąg znaków 'tek'");
        for (int i = 0; i < dniTygdodnia.length; i+=2) {
            if (dniTygdodnia[i].contains("tek")) {
                System.out.println(dniTygdodnia[i]);
            }
        }
        System.out.println();
    }
}
