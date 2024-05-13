public boolean more14(int[] nums) {
  int count1 = 0, count4 = 0;
  
  for(int i: nums)  {
    if(i == 1)  count1++;
    if(i == 4)  count4++;
  }
  
  return count1 > count4;
}
