public int sumHeights2(int[] heights, int start, int end) {
  int sum = 0;
  
  for(int i=start+1; i<=end; i++) {
    if(heights[i-1] - heights[i] < 0) sum = sum + 2*Math.abs(heights[i-1] - heights[i]);
    else sum = sum + Math.abs(heights[i-1] - heights[i]);
  }
  
  return sum;
}
