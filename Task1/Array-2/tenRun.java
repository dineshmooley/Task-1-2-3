public int[] tenRun(int[] nums) {
  int maxMult = -1;
  
  for(int i=0; i<nums.length; i++)  {
    if(nums[i] % 10 == 0) {
      maxMult = nums[i];
    }
    
    if(maxMult != -1) nums[i] = maxMult;
  }
  
  return nums;
}
