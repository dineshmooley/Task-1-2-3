public boolean unlucky1(int[] nums) {
  
  if(nums.length < 2) return false;
  for(int i=0; i<2; i++)  {
    if(nums[i] == 1 && nums[i+1] == 3)  return true;
  }
  
  for(int i=nums.length - 2; i<nums.length -1; i++)  {
    if(nums[i] == 1 && nums[i+1] == 3)  return true;
  }
  
  return false;
}
