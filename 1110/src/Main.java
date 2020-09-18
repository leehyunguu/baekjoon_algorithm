import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = -1;
        int cnt = 0;
        while (a != b) {
            if (b == -1) {
                b = a;
            }
            int c = a / 10;
            int d = a % 10;
            int e = c + d;
            a = (d * 10) + (e % 10);
            cnt++;
        }
        System.out.println(cnt);
    }
}