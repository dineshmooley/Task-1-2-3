public boolean sum28(int[] nums) {
  int count = 0;
  
  for(int i: nums)  {
    if(i == 2)  count += 2;
  }
  
  return count == 8;
}
