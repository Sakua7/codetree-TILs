import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = scanInt(br.readLine());
        int max = 0;
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String color = scanString(br.readLine());
            if (hm.get(color) == null) {
                hm.put(color, 1);
                if (max == 0) max = 1;
            } else {
                int v = hm.get(color) + 1;
                if (v > max) {
                    max = v;
                }
                hm.put(color, v);
            }
        }

        print(max);

        bw.flush();
        br.close();
        bw.close();;
    }

    private static int scanInt(String token) {
        return Integer.parseInt(token);
    }

    private static String scanString(String token) {
        return token;
    }

    private static void print(Object obj) {
        System.out.print(obj);
    }

    private static void println(Object obj) {
        System.out.println(obj);
    }
}