public class Zadanie07 {
    public static void main(String[] args) {
        String jedzenie = "banan";
        switch (jedzenie) {
            case "jabłko":
            case "wiśnia":
            case "banan":
                System.out.println("owoc");
                break;
            case "szparag":
            case "brokuł":
            case "marchew":
                System.out.println("warzywo");
                break;
        }
    }
}
