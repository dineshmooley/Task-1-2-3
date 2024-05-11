public boolean evenlySpaced(int a, int b, int c) {
  int max = Math.max(Math.max(a, b), c);
  int min = Math.min(Math.min(a, b), c);
  int mid = a + b + c - max - min;
  
  return mid - min == max - mid;
}
