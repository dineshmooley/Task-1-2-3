public int countEvens(int[] nums) {
  int count = 0;
  
  for(int i: nums)  {
    if(i % 2 == 0)  count++;
  }
  
  return count;
}
