public int maxMirror(int[] nums) {
  int maxMirror = 0;
  for (int i = 0; i < nums.length; i++) {
    for (int j = nums.length - 1; j >= 0; j--) {
      int count = 0;
      int m = i;
      int n = j;
      while (m < nums.length && n >= 0 && nums[m] == nums[n]) {
        count++;
        m++;
        n--;
      }
      maxMirror = Math.max(maxMirror, count);
    }
  }
    return maxMirror;
}
