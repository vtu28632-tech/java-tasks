import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            String s1 = sc.next(), s2 = sc.next();
            System.out.println(shareSubstring(s1, s2) ? "YES" : "NO");
        }
    }

    static boolean shareSubstring(String s1, String s2) {
        for (char c : s1.toCharArray()) {
            if (s2.indexOf(c) != -1) return true;
        }
        return false;
    }
}