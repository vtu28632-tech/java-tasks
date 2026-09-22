import java.util.*;

public class Task_4_DNA_KMP_Search {
    static int[] buildLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0;
        for (int i = 1; i < pattern.length();) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }
        return lps;
    }

    static void search(String text, String pattern) {
        int[] lps = buildLPS(pattern);
        int i = 0, j = 0;
        boolean first = true;

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++; j++;
                if (j == pattern.length()) {
                    if (!first) System.out.print(" ");
                    System.out.print(i - j);
                    first = false;
                    j = lps[j - 1];
                }
            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().trim();
        String pattern = sc.nextLine().trim();
        search(text, pattern);
        sc.close();
    }
}

