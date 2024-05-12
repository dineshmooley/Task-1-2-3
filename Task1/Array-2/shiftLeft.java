public int[] shiftLeft(int[] nums) {
  
  if(nums.length == 0)  return new int[0];
  int temp = nums[0];
  for(int i=1; i<nums.length; i++)  {
    nums[i-1] = nums[i];
  }
  
  nums[nums.length - 1] = temp;
  
  return nums;
}
