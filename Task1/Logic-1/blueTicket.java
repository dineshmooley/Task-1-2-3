public int blueTicket(int a, int b, int c) {
  if(a + b == 10 || c + b == 10 || a + c == 10) return 10;
  if(a + b == 10 + b + c || a + b == 10 + a + c)  return 5;
  return 0;
}
