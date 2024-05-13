public int[] zeroMax(int[] nums) {
  for(int i=0; i<nums.length - 1; i++)  {
    if(nums[i] == 0)  {
      int largeOdd = 0;
      for(int j=i+1; j<nums.length; j++) {
        if(nums[j] % 2 != 0)  {
          largeOdd = Math.max(largeOdd, nums[j]);
        }
      }
      nums[i] = largeOdd;
    }
  }
  
  return nums;
}
