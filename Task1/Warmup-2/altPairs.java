public String altPairs(String str) {
  String ans = "";
  for(int i=0; i<str.length(); i += 4)  {
    if(i+2 < str.length()) ans += str.substring(i, i+2);
    else ans += str.substring(i);
  }
  return ans;
}
