class Solution {
 public int myAtoi(String s){
  int i=0,n=s.length(),sign=1,res=0;
  while(i<n&&s.charAt(i)==' ')i++;
  if(i<n&&(s.charAt(i)=='+'||s.charAt(i)=='-')){if(s.charAt(i++)=='-')sign=-1;}
  while(i<n&&Character.isDigit(s.charAt(i))){int x=s.charAt(i++)-'0'; if(res>(Integer.MAX_VALUE-x)/10)return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE; res=res*10+x;}
  return res*sign;
 }
}