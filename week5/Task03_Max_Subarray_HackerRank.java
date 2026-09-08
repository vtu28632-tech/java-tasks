import java.util.*;
public class Result {
 public static List<Integer> maxSubarray(List<Integer> a){
  int cur=a.get(0), max=a.get(0), positive=0, largest=a.get(0);
  for(int x:a){ if(x>0) positive+=x; largest=Math.max(largest,x); }
  for(int i=1;i<a.size();i++){cur=Math.max(a.get(i),cur+a.get(i));max=Math.max(max,cur);}
  return Arrays.asList(max, largest<0?largest:positive);
 }
}