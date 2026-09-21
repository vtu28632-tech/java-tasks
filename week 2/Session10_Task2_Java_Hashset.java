import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        Set<String> set = new HashSet<>();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            set.add(st.nextToken() + " " + st.nextToken());
            System.out.println(set.size());
        }
    }
}
