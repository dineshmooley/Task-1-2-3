public String stringSplosion(String str) {
  String ans = "";
  for(int i=0; i<str.length(); i++) {
    for(int j=0; j<=i; j++) {
      ans += str.charAt(j);
    }
  }
  
  return ans;
}
