public boolean isEndy(int n)  {
  if((n >= 0 && n <= 10) || (n >= 90 && n <= 100))  return true;
  return false;
}

public int[] copyEndy(int[] nums, int count) {
  int[] ans = new int[count];
  
  int j = 0;
  for(int i: nums)  {
    if(isEndy(i))  {
      ans[j++] = i;
      if(j == count)  break;
    }
  }
  
  return ans;
}
