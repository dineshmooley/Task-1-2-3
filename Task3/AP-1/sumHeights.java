public int sumHeights(int[] heights, int start, int end) {
  int sum = 0;
  
  for(int i=start+1; i<=end; i++) {
    sum = sum + Math.abs(heights[i-1] - heights[i]);
  }
  
  return sum;
}
