import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = reader.readLine();
        int X = Integer.parseInt(a.split(" ")[1]);
        String collect = Arrays.stream(reader.readLine().split(" ")).filter(s -> Integer.parseInt(s) < X).collect(Collectors.joining(" "));
        writer.write(collect);
        writer.flush();
    }
}
