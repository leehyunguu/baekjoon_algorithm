import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        int a;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        a = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= a; i++) {
            writer.write(i + "\n");
        }
        writer.flush();
    }
}
