public String repeatEnd(String str, int n) {
  String ans = "", rep = "";
  
  for(int i=str.length() - n; i< str.length(); i++) {
    ans += str.charAt(i);
  }
  
  for(int i=0; i<n; i++)  {
    rep += ans;
  }
  
  return rep;
}
