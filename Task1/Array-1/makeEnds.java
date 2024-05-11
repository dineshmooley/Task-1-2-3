public int[] makeEnds(int[] nums) {
  int[] ans = new int[2];
  
  ans[0] = nums[0];
  ans[1] = nums[nums.length - 1];
  
  return ans;
}
