public class Zadanie09 {
    public static void main(String[] args) {
        int[] kodCvv = {9, 1, 3};
        for (int i = 0; i < kodCvv.length / 2; i++) {
            int tmp = kodCvv[i];
            kodCvv[i] = kodCvv[kodCvv.length - 1 - i];
            kodCvv[kodCvv.length - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(kodCvv));
    }
}
