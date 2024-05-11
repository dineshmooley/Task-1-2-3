public boolean prefixAgain(String str, int n) {
  String ans = str.substring(0, n);
  
  for(int i=n; i<=str.length() - n; i++) {
    if(str.substring(i, i+n).equals(ans)) return true;
  }
  
  return false;
}
