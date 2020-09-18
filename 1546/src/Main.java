import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] b = new int[a];
        int c = 0;
        double s = 0;
        for (int i = 0; i < a; i++) {
            b[i] = scanner.nextInt();
            if (c < b[i]) {
                c = b[i];
            }
        }
        for (int i = 0; i < a; i++) {
            s += b[i] / (double)c * 100;
        }
        System.out.printf("%f", s/a);
    }
}
