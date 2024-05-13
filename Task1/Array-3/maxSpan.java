public int maxSpan(int[] nums) {
  int maxSpan = 0;
  for (int i = 0; i < nums.length; i++) {
    for (int j = nums.length - 1; j >= i; j--) {
      if (nums[i] == nums[j]) {
        maxSpan = Math.max(maxSpan, j - i + 1);
        break; 
      }
    }
  }
    return maxSpan;
}
