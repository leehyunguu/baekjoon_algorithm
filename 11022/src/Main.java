import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        int a;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        a = Integer.parseInt(reader.readLine());
        for (int i = 0; i < a; i++) {
            String[] c = reader.readLine().split(" ");
            writer.write("Case #" + (i + 1) + ": " + c[0] + " + " + c[1] + " = " + (Integer.parseInt(c[0]) + Integer.parseInt(c[1])) + "\n");
        }
        writer.flush();
    }
}
