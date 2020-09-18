import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0,b = scanner.nextInt();
        for (int i = 1; i <= b; i++) {
            a+=i;
        }
        System.out.println(a);
    }
}
