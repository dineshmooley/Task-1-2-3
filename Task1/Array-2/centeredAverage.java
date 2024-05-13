public int centeredAverage(int[] nums) {
 int max = 0, min = 99;
 int sum = 0;

  for(int i: nums)  { 
    sum += i;
    max = Math.max(max, i);
    min = Math.min(min, i);
  }
  
  return (sum - max - min) / (nums.length - 2);
}
