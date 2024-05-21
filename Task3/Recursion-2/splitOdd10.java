public boolean splitOdd10(int[] nums) {
  return splitOdd(0, nums, 0, 0);
}

public boolean splitOdd(int start, int[] nums, int mult, int odd) {
  if(start >= nums.length)  return mult % 10 == 0 && odd % 2 == 1;
  if(splitOdd(start+1, nums, mult + nums[start], odd))  return true;
  if(splitOdd(start+1, nums, mult, odd + nums[start]))  return true;
  
  return false;
}
