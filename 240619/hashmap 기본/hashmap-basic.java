import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = scanInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "add":
                    hm.put(scanInt(st.nextToken()), scanInt(st.nextToken()));
                    break;

                case "find":
                    int key = scanInt(st.nextToken());
                    if (hm.get(key) != null) {
                        println(hm.get(key));
                    } else {
                        println("None");
                    }
                    break;

                case "remove":
                    hm.remove(scanInt(st.nextToken()));
                    break;

                default:
                    break;
            }
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

    private static void println(Object obj) {
        System.out.println(obj);
    }
}