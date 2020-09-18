import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String a;
        while((a = reader.readLine()) != null) {
            String[] s = a.split(" ");
            writer.write(Integer.parseInt(s[0]) + Integer.parseInt(s[1]) + "\n");
            writer.flush();
        }
    }
}
