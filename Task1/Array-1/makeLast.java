public int[] makeLast(int[] nums) {
  int[] ans = new int[2*nums.length];
  
  ans[ans.length - 1] = nums[nums.length - 1];
  return ans;
}
