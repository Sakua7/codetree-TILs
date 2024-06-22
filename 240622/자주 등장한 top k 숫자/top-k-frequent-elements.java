import java.util.*;
import java.io.*;

class V {
    int v;
    int cnt;
    public V(int v, int cnt) {
        this.v = v;
        this.cnt = cnt;
    }
}

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int n = scanInt(st.nextToken());
        int k = scanInt(st.nextToken());

        ArrayList<V> vrr = new ArrayList<>(n + 1);
        while(vrr.size() <= n) {
            vrr.add(null);
        }

        HashMap<Integer, Boolean> hm = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int v = scanInt(st.nextToken());
            if (hm.containsKey(v)) {
                vrr.get(v).cnt += 1;
            } else {
                vrr.set(v, new V(v, 1));
                hm.put(v, true);
            }
        }

        Comparator<V> vComparator = new Comparator<V>() {
            @Override
            public int compare(V o1, V o2) {
                if (o1.cnt == o2.cnt) {
                    return o2.v - o1.v;
                } else {
                    return o2.cnt - o1.cnt;
                }
            }
        };

        vrr.removeAll(Collections.singleton(null));
        Collections.sort(vrr, vComparator);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i != k - 1) {
                sb.append(vrr.get(i).v);
                sb.append(" ");
            } else {
                sb.append(vrr.get(i).v);
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