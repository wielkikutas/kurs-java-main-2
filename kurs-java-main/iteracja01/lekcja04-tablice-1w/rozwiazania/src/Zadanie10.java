public class Zadanie10 {
    public static void main(String[] args) {
        String[] samochodyWGarazu = {
                "a45 amg",
                "mustang",
                "M3",
                "X6",
                "Q8",
        };
        int usuwanyIndex = 2;

        // przesuwamy samochody o jeden to tylu
        for (int i = 0; i < samochodyWGarazu.length; i++) {
            if (i > usuwanyIndex) {
                samochodyWGarazu[i - 1] = samochodyWGarazu[i];
            }
        }

        String[] mniejszyGaraz = new String[samochodyWGarazu.length - 1];

        for (int i = 0; i < mniejszyGaraz.length; i++) {
            mniejszyGaraz[i] = samochodyWGarazu[i];
        }
        System.out.println(Arrays.toString(mniejszyGaraz));
    }
}
