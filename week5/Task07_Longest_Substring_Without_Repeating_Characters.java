import java.util.*;
class Solution {
 public int lengthOfLongestSubstring(String s){
  Map<Character,Integer> last=new HashMap<>(); int l=0,best=0;
  for(int r=0;r<s.length();r++){char c=s.charAt(r); if(last.containsKey(c))l=Math.max(l,last.get(c)+1); last.put(c,r); best=Math.max(best,r-l+1);}
  return best;
 }
}