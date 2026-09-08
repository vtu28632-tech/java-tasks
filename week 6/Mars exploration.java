import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("SOS".charAt(i % 3) != s.charAt(i)) count++;
        }
        System.out.println(count);
    }
}