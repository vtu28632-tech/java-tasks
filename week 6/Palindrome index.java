import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(palindromeIndex(s));
        }
    }

    static int palindromeIndex(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                if (isPalindrome(s, i + 1, j)) return i;
                if (isPalindrome(s, i, j - 1)) return j;
                return -1;
            }
            i++; j--;
        }
        return -1;
    }

    static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}