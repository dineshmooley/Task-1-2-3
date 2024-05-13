public int[] pre4(int[] nums) {
  int index4 = -1;
  
  for(int i=0; i<nums.length; i++)  {
    if(nums[i] == 4)  {
      index4 = i;
      break;
    }
  }
  
  if(index4 == -1)  return new int[0];
  
  int[] ans = new int[index4];
  
  for(int i=0; i<index4; i++) {
    ans[i] = nums[i];
  }
  
  return ans;
  
}
