public int countClumps(int[] nums) {
  int clumps = 0;
  boolean isClump = false;

  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] == nums[i + 1]) {
      if (!isClump) {
        clumps++;
        isClump = true;
      }
    } 
    else  isClump = false;
  }

    return clumps;
}
