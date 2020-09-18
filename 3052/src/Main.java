import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(IntStream.range(0, 10).map(operand -> scanner.nextInt()).map(operand -> operand % 42).distinct().count());
    }
}
