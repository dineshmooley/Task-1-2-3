public int close10(int a, int b) {
  if(Math.abs(a-10) == Math.abs(b-10))  return 0;
  else if(Math.abs(a-10) > Math.abs(b-10)) return b;
  return a;
}
