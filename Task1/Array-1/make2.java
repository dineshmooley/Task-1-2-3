public int[] make2(int[] a, int[] b) {
  int[] ans = new int[2];
  
  int count = 0;
  
  for(int i: a) {
    ans[count++] = i;
    if(count == 2)  break;
  }
  
  if(count < 2) {
    for(int i: b) {
      ans[count++] = i;
      if(count == 2)  break;
    }
  }
  
  return ans;
  
}
