public int count7(int n) {
  if(n == 0)  return 0;
  if(n % 10 == 7) return 1 + count7(n / 10);
  return 0 + count7(n / 10);
}
