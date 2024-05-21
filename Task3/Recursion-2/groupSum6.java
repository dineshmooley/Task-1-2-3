public boolean groupSum6(int start, int[] nums, int target) {
  if(start >= nums.length)  return target == 0;
  
  if(nums[start] % 6 == 0)  {
    if(start+1 < nums.length && nums[start+1] == 1) return groupSum6(start+2, nums, target - nums[start]);
    return groupSum6(start+1, nums, target - nums[start]);
  }
  
  if(groupSum6(start+1, nums, target - nums[start])) return true;
  if(groupSum6(start+1, nums, target)) return true;
  
  return false;
}
