import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        int a;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        a = Integer.parseInt(reader.readLine());
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            String[] c = reader.readLine().split(" ");
            b.add(Integer.parseInt(c[0]) + Integer.parseInt(c[1]));
        }
        for (int i = 0; i < b.size(); i++) {
            writer.write("Case #" + (i + 1) + ": " + b.get(i) + "\n");
        }
        writer.flush();
    }
}
