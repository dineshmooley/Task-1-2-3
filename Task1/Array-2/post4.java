public int[] post4(int[] nums) {
  
  int lastIndex = -1;
  
  for(int i=0; i< nums.length; i++) {
    if(nums[i] == 4)  lastIndex = i;
  }
  
  int[] ans = new int[nums.length  - lastIndex - 1];
  
  int j = 0;
  for(int i = lastIndex + 1; i< nums.length; i++) {
    ans[j++] = nums[i];
  }  
  
  return ans;
}
