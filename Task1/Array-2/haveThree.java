public boolean haveThree(int[] nums) {
  int count = 0;
  int lastIndex = -2;
  for(int i = 0; i< nums.length; i++)  {
    if(nums[i]== 3)  {
      if(i - lastIndex == 1)  return false;
      else{
        count++;
        lastIndex = i;
      }
    }
  }
  
  return count == 3;
}
