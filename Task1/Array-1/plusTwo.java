public int[] plusTwo(int[] a, int[] b) {
  
  int[] ans = new int[4];
  for(int i=0; i<2; i++)  {
    ans[i] = a[i];
    ans[i+2] = b[i];
  }
  
  return ans;
}
