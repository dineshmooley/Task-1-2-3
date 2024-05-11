public int luckySum(int a, int b, int c) {
  int sum = 0;
  if(a == 13) return sum;
  else  sum += a;
  
  if(b == 13) return sum;
  else  sum += b;
  
  if(c == 13) return sum;
  else  sum += c;
  
  return sum;
}
