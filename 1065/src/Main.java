import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 0;
        if (a < 100) {
            count=a;
        } else {
            count+=99;
            for (int i = 100; i <= a; i++) {
                int b = i / 100;
                int c = i / 10 % 10;
                int d = i % 10;
                if (b - c == c - d) count++;
            }
        }
        System.out.println(count);
    }
}