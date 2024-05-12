public int sum67(int[] nums) {
  int sum = 0;
  boolean wait = false;
  
  for(int i=0; i<nums.length; i++)  {
    if(nums[i] == 6)  wait = true;
    else if(wait)  {
      if(nums[i] == 7)  {
        wait = false;
      }
    }
    else  sum += nums[i];
  }
  
  return sum;
}
