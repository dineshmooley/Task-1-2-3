public int sum2(int[] nums) {
  int count = 2;
  int sum = 0;
  for(int i: nums)  {
    sum += i;
    count--;
    if(count == 0)  {
      break;
    }
  }
  
  return sum;
}
