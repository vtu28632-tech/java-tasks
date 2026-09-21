import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Deque<Integer> dq = new ArrayDeque<>();
        Map<Integer,Integer> freq = new HashMap<>();
        int distinct = 0, answer = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(st.nextToken());
            dq.addLast(x);
            freq.put(x, freq.getOrDefault(x, 0) + 1);
            if (freq.get(x) == 1) distinct++;

            if (dq.size() > m) {
                int old = dq.removeFirst();
                freq.put(old, freq.get(old) - 1);
                if (freq.get(old) == 0) {
                    freq.remove(old);
                    distinct--;
                }
            }
            if (dq.size() == m) answer = Math.max(answer, distinct);
        }
        System.out.println(answer);
    }
}
