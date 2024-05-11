public boolean posNeg(int a, int b, boolean negative) {
  if(negative)  return a < 0 && b < 0;
  int posCount = 0;
  int negCount = 0;
  if(a < 0 || b < 0)  {
    negCount++;
  }
  if(a > 0 || b > 0)  {
    posCount++;
  }
  
  return  negCount == posCount;
}
