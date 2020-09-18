import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            b.add(scanner.nextInt() + scanner.nextInt());
        }
        for (Integer c : b) {
            System.out.println(c);
        }
    }
}
