import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> hm = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        int n = scanInt(st.nextToken());
        int m = scanInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int val = scanInt(st.nextToken());
            if (hm.get(val) == null) {
                hm.put(val, 1);
            } else {
                hm.put(val, hm.get(val) + 1);
            }
        }

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int query = scanInt(st.nextToken());

            if (hm.get(query) == null) {
                sb.append(0);
            } else {
                sb.append(hm.get(query));
            }
            if (i != m - 1) {
                sb.append(" ");
            }
        }
        
        print(sb.toString());

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