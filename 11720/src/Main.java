import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        String i1 = scanner.next();
        i = Math.min(i, i1.length());
        int k = 0;
        for (int j = 0; j < i  ; j++) {
            k += Integer.parseInt(String.valueOf(i1.charAt(j)));
        }
        System.out.println(k);
    }
}