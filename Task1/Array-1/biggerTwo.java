public int[] biggerTwo(int[] a, int[] b) {
  int aSum = 0, bSum = 0;
  
  for(int i: a) aSum += i;
  for(int i: b) bSum += i;
  
  if(aSum < bSum) return b;
  return a;
}
