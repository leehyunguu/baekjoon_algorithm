import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        String b;
        a = scanner.nextInt();
        b = scanner.next();

        for (int i = b.length()-1; i >= 0; i--) {
            char c = b.charAt(i);
            System.out.println(a * Integer.parseInt(String.valueOf(c)));
        }
        System.out.println(a * Integer.parseInt(b));
    }
}
