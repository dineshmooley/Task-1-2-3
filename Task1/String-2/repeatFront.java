public String repeatFront(String str, int n) {
  String ans = "";
  for(int i=n; i>=0; i--) {
    ans += str.substring(0, i);
  }
  
  return ans;
}
