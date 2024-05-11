public int[] midThree(int[] nums) {
  int[] ans = new int[3];
  
  ans[0] = nums[nums.length/2 - 1];
  ans[1] = nums[nums.length/2];
  ans[2] = nums[nums.length/2 + 1];
  
  return ans;
}
