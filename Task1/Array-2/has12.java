public boolean has12(int[] nums) {
  int count1 = 0;
  for(int i=0; i<nums.length; i++)  {
    if(nums[i] == 1)  {
      count1++;
      int count2 = 0;
      for(int j=i+1; j<nums.length; j++)  {
        if(nums[j] == 2)  count2++;
      }
      if(count2 == 0) return false; 
    }
  }
  if(count1 == 0) return false;
  return true;
}
