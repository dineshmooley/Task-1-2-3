public boolean double23(int[] nums) {
  int count2 = 0, count3 = 0;
  
  for(int i: nums)  {
    if(i == 2)  count2++;
    if(i == 3)  count3++;
  }
  
  return count2 == 2 || count3 == 2;  
}
