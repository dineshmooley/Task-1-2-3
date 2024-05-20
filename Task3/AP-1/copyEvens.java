public int[] copyEvens(int[] nums, int count) {
  int[] ans = new int[count];
  int temp = 0;
  for(int i: nums)  {
    if(i % 2 == 0)  {
      ans[temp++] = i;  
      if(temp == count) break;
    }
  }
  
  return ans;
}
