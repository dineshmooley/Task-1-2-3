public boolean splitArray(int[] nums) {
  return split(0, nums, 0, 0);
}

public boolean split(int start, int[] nums, int group1, int group2) {
  if(start >= nums.length)  return group1 == group2;
  if(split(start+1, nums, group1 + nums[start], group2))  return true;
  if(split(start+1, nums, group1, group2 + nums[start]))  return true;
  return false;
}
