public int[] withoutTen(int[] nums) {
  int[] ans = new int[nums.length];
  int j = 0;
  
  for(int i=0; i<nums.length; i++)  {
    if(nums[i] != 10) {
      ans[j++] = nums[i];
    }
  }
  
  return ans;
}
