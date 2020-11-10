import java.util.Scanner;

public class Main {
    public static boolean[] N;
    public static int[] M;
    public static StringBuilder builder = new StringBuilder();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = new boolean[scanner.nextInt()];
        M = new int[scanner.nextInt()];
        func(1, N.length, M.length, 0);
        System.out.print(builder.toString());
    }

    static void func(int j, int n, int m, int depth) {
        if (m == depth) {
            for (int i = 0; i < m; i++) {
                builder.append(M[i]).append(" ");
            }
            builder.append("\n");
            return;
        }
        for (int i = j; i <= n; i++) {
            M[depth] = i;
            func(i + 1, n, m, depth + 1);
        }
    }
}
