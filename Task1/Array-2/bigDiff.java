public int bigDiff(int[] nums) {
  int min = 99, max = -1;
  
  for(int i: nums)  {
    min = Math.min(min, i);
    max = Math.max(max, i);
  }
  
  return max - min;
}
