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

        int MAX_N = 100000;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] arr = new int[MAX_N];
        ArrayList<V> vrr = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = scanInt(st.nextToken());
            if(!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            } else {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
        }

        for (Integer key : hm.keySet()) {
            vrr.add(new V(key, hm.get(key)));
        }
        
        Collections.sort(vrr, new Comparator<V>() {
            @Override
            public int compare(V o1, V o2) {
                if (o1.cnt == o2.cnt) {
                    return o2.v - o1.v;
                } else {
                    return o2.cnt - o1.cnt;
                }
            }
        });


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(vrr.get(i).v);
            sb.append(" ");
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