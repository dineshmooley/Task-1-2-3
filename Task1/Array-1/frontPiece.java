public int[] frontPiece(int[] nums) {
  if(nums.length < 2) return nums;
  
  int[] ans = new int[2];
  for(int i=0; i<2; i++)  {
    ans[i] = nums[i];
  }
  
  return ans;
}
