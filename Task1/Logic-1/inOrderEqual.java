public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  if(equalOk) {
    return (c > b || c == b) && (a < b || b == a);
  }
  
  return a < b && b < c;
}
