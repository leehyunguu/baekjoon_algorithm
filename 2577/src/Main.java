import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        String s = String.valueOf(a * b * c);
        int[] d = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < s.length(); i++) {
            d[s.charAt(i)-48]++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(d[i]);
        }
    }
}
