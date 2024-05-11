public int sumLimit(int a, int b) {
  int len = String.valueOf(a).length();
  int sum = String.valueOf(a + b).length();
  if(sum > len) return a;
  return a + b;
  
}
