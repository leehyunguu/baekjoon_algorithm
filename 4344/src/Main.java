import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double[] z = new double[a];
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            int[] e = new int[b];
            int c = 0;
            for (int j = 1; j <= b; j++) {
                e[j-1] = scanner.nextInt();
                c += e[j-1];
            }
            double d = c/(double)b;
            int f = 0;
            for (int k : e) {
                f = k > d ? f + 1 : f;
            }
            z[i] = f/(double)b;
        }
        for (double v : z) {
            System.out.printf("%.3f%%%n", v * 100);
        }
    }
}
