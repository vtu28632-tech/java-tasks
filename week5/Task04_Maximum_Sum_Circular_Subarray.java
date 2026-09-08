class Solution {
 public int maxSubarraySumCircular(int[] a){
  int total=a[0], maxEnd=a[0], max=a[0], minEnd=a[0], min=a[0];
  for(int i=1;i<a.length;i++){int x=a[i]; total+=x; maxEnd=Math.max(x,maxEnd+x); max=Math.max(max,maxEnd); minEnd=Math.min(x,minEnd+x); min=Math.min(min,minEnd);}
  return max<0?max:Math.max(max,total-min);
 }
}