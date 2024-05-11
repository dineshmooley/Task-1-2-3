public String starOut(String str) {
  String ans = "";
  for(int i=0; i<str.length(); i++) {
    if(str.charAt(i) == '*') continue;
    else if(i > 0 && str.charAt(i-1) == '*')  continue;
    else if(i < str.length() - 1 && str.charAt(i+1) == '*') continue;
    else ans += str.charAt(i);
  }
  
  return ans;
}
