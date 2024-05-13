public boolean canBalance(int[] nums) {
  int total = 0, sum = 0;
  
  for(int i: nums)  {
    total += i;
  }
  
  for(int i=0; i<nums.length - 1; i++)  {
    sum += nums[i];
    if(sum == total - sum) return true;
  }
  
  return false;
}
