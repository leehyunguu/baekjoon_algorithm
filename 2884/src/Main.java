import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        LocalTime time = LocalTime.of(a, b);
        LocalTime minusTime = time.minusMinutes(45);
        System.out.println(minusTime.getHour() + " " + minusTime.getMinute());
    }
}
