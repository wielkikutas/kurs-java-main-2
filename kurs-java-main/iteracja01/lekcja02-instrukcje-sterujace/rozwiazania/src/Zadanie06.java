public class Zadanie06 {
    public static void main(String[] args) {
        // lepsze rozwiązanie
        String miesiac = "styczen";
        switch (miesiac) {
            case "styczen":
            case "marzec":
            case "maj":
            case "lipiec":
            case "sierpień":
            case "październik":
            case "grudzień":
                System.out.println(31);
                break;
            case "luty":
                System.out.println(28);
                break;
            case "kwiecien":
            case "czerwiec":
            case "wrzesień":
            case "listopad":
                System.out.println(30);
                break;
            default:
                System.out.println("Nierozpoznany miesiac");
                break;
        }

        // gorsze rozwiązanie
        miesiac = "styczen";
        switch (miesiac) {
            case "styczen":
                System.out.println(31);
                break;
            case "luty":
                System.out.println(28);
                break;
            case "marzec":
                System.out.println(31);
                break;
            case "kwiecien":
                System.out.println(30);
                break;
            case "maj":
                System.out.println(31);
                break;
            case "czerwiec":
                System.out.println(30);
                break;
            case "lipiec":
                System.out.println(31);
                break;
            case "sierpień":
                System.out.println(31);
                break;
            case "wrzesień":
                System.out.println(30);
                break;
            case "październik":
                System.out.println(31);
                break;
            case "listopad":
                System.out.println(30);
                break;
            case "grudzień":
                System.out.println(31);
                break;
            default:
                System.out.println("Nierozpoznany miesiac");
                break;
        }
    }
}
