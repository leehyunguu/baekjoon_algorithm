import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] c = new int[a];
        for (int i = 0; i < a; i++) {
            String s = scanner.next();
            int b = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    b = j == 0 ? 1 : b + 1;
                } else {
                    b = 0;
                }
                c[i] += b;
            }
        }
        for (int j : c) {
            System.out.println(j);
        }
    }
}
