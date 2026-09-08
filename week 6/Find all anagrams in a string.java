import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) return res;

        int[] count = new int[26];
        for (char c : p.toCharArray()) count[c - 'a']++;

        int left = 0, right = 0;
        int[] window = new int[26];
        while (right < s.length()) {
            window[s.charAt(right) - 'a']++;
            if (right - left + 1 == p.length()) {
                if (Arrays.equals(count, window)) res.add(left);
                window[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }
        return res;
    }
}