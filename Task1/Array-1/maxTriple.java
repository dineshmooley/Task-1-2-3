public int maxTriple(int[] nums) {
  int m = Math.max(nums[0], nums[nums.length - 1]);
  m = Math.max(m, nums[nums.length / 2]);
  
  return m;
}
