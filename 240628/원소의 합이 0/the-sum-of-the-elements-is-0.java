import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int MAX_N = 4000;
        int n = scanInt(br.readLine());

        int[] A = new int[MAX_N];
        int[] B = new int[MAX_N];
        int[] C = new int[MAX_N];
        int[] D = new int[MAX_N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) A[i] = scanInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) B[i] = scanInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) C[i] = scanInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) D[i] = scanInt(st.nextToken());

        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = A[i] + B[j];
                hm.put(key, hm.getOrDefault(key, 0) + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int diff = -(C[i] + D[j]);
                if (hm.getOrDefault(diff, 0) > 0) {
                    ans += hm.get(diff);
                }
            }
        }

        print(ans);
        
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