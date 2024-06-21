import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        HashMap<String, String> hm = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        int n = scanInt(st.nextToken());
        int m = scanInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String idx = Integer.toString(i + 1);
            String str = scanString(br.readLine());
            hm.put(str, idx);
            hm.put(idx, str);
        }

        for (int i = 0; i < m; i++) {
            String target = scanString(br.readLine());
            println(hm.get(target));
        }

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