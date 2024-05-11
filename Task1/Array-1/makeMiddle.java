public int[] makeMiddle(int[] nums) {
  int[] ans = new int[2];
  
  ans[0] = nums[nums.length/2 -1];
  ans[1] = nums[nums.length/2];
  
  return ans;
}
