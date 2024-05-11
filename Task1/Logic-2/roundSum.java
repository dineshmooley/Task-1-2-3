public int roundSum(int a, int b, int c) {
  return round10(a) + round10(b) + round10(c);
}

public int round10(int num)  {
  if( num % 10 >= 5)  return num + 5 - (num % 10 - 5);
  return num - num % 10;
}
