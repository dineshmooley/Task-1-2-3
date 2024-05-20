public int scoresSpecial(int[] a, int[] b) {
  return special(a) + special(b);
}

public int special(int[] nums)  {
  int max = 0;
  
  for(int i: nums)  {
    if(i % 10 == 0) {
      max = Math.max(max, i);
    }
  }
  
  return max;
}
