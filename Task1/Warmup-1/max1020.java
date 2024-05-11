public int max1020(int a, int b) {
  int n1 = 0, n2 = 0;
  if(a >= 10 && a <= 20)  n1 = a;
  if(b >= 10 && b <= 20)  n2 = b;
  return Math.max(n1, n2);
}
