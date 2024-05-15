public int fibonacci(int n) {
  if(n == 0)  return n;
  if(n == 2 || n == 1)  return 1;
  return fibonacci(n-1) + fibonacci(n-2);
}
