import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.readLine();
            String[] s = reader.readLine().split(" ");
            OptionalInt min = Arrays.stream(s).mapToInt(Integer::valueOf).min();
            OptionalInt max = Arrays.stream(s).mapToInt(Integer::valueOf).max();
            System.out.println(min.getAsInt() + " " + max.getAsInt());
        }

    }
}
