import java.io.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = reader.readLine();
        while(!a.contentEquals("0 0")) {
            String[] s = a.split(" ");
            writer.write(Integer.parseInt(s[0]) + Integer.parseInt(s[1]) + "\n");
            a = reader.readLine();
        }
        writer.flush();
    }
}
