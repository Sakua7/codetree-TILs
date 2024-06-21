import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        HashMap<Integer, Boolean> hm = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        int n = scanInt(st.nextToken());
        int k = scanInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int v = scanInt(st.nextToken());
            if (hm.get(v) == null) {
                hm.put(v, true);
            }
            int diff = k - v;
            if (hm.get(diff) != null) {
                cnt += 1;
            }
        }
        print(cnt);

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