public class Cumulative {
    public static void main(String[] a) {
        for (int n : new int[]{4, 5, 10})
            System.out.println("Cumulative Sum for: " + n + " = " + n * (n + 1) / 2);
    }
}
