```java
import java.io.*;
import java.util.*;

public class Main {

    // Returns the longest palindromic substring length in s
    static int longestPalindrome(String s) {
        int n = s.length();

        // Transform string:
        // "abba" -> "^#a#b#b#a#$"
        char[] t = new char[2 * n + 3];
        t[0] = '^';

        int idx = 1;
        for (int i = 0; i < n; i++) {
            t[idx++] = '#';
            t[idx++] = s.charAt(i);
        }

        t[idx++] = '#';
        t[idx] = '$';

        int[] p = new int[t.length];
        int center = 0;
        int right = 0;
        int maxLen = 0;

        for (int i = 1; i < t.length - 1; i++) {

            int mirror = 2 * center - i;

            if (i < right) {
                p[i] = Math.min(right - i, p[mirror]);
            }

            // Expand around center i
            while (t[i + (1 + p[i])] == t[i - (1 + p[i])]) {
                p[i]++;
            }

            // Update center and right boundary
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }

            maxLen = Math.max(maxLen, p[i]);
        }

        return maxLen;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        String s = br.readLine().trim();

        String doubled = s + s;

        StringBuilder output = new StringBuilder();

        // Every rotation starts at position i
        for (int i = 0; i < n; i++) {

            String rotation = doubled.substring(i, i + n);

            int answer = longestPalindrome(rotation);

            output.append(answer).append('\n');
        }

        System.out.print(output);
    }
}
```