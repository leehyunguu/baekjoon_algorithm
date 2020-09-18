import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int a;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        a = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (a - i >= j) {
                    writer.write(" ");
                } else {
                    writer.write("*");
                }
            }
            if (i != a) {
                writer.write("\n");
            }
        }
        writer.flush();
    }
}
