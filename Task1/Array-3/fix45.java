public int[] fix45(int[] nums) {
 
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
            nums[j] = nums[i + 1];
            nums[i + 1] = 5;
            break;
        }
      }
    }
  }
    return nums;

}
