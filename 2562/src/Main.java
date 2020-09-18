import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int c = 0;
        for (int i = 0; i < 9; i++) {
            int b = scanner.nextInt();
            if (a < b) {
                a = b;
                c = i;
            }
        }
        System.out.println(a);
        System.out.println(c+1);
    }
}
