public int[] seriesUp(int n) {
  int temp = n, len = 0;
  while(temp != 0)  {
    len += temp--;
  }
  
  int[] ans = new int[len];
  int count = 0;
  for(int i=1; i<=n; i++)  {
    for(int j=1; j<=i; j++) {
      ans[count++] = j;
    }
  }
  
  return ans;
}
