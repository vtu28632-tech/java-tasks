import java.util.*;
class Solution {
 public static List<Integer> search(String text,String pattern){
  List<Integer> ans=new ArrayList<>(); int n=text.length(),m=pattern.length();
  if(m==0||m>n)return ans;
  for(int i=0;i<=n-m;i++){int j=0;while(j<m&&text.charAt(i+j)==pattern.charAt(j))j++;if(j==m)ans.add(i);}
  return ans;
 }
}