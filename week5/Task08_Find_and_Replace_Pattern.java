import java.util.*;
class Solution {
 public List<String> findAndReplacePattern(String[] words,String p){
  List<String> ans=new ArrayList<>(); for(String w:words)if(ok(w,p))ans.add(w); return ans;
 }
 private boolean ok(String w,String p){
  if(w.length()!=p.length())return false;
  Map<Character,Character>a=new HashMap<>(),b=new HashMap<>();
  for(int i=0;i<w.length();i++){char x=w.charAt(i),y=p.charAt(i);
   if(a.containsKey(x)&&a.get(x)!=y)return false; if(b.containsKey(y)&&b.get(y)!=x)return false;
   a.put(x,y);b.put(y,x);
  } return true;
 }
}