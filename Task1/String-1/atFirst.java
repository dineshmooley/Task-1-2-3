public String atFirst(String str) {
  String ans = "";
  if(str.length() > 0)  ans += str.charAt(0);
  else  ans += "@";
  
  if(str.length() > 1)  ans += str.charAt(1);
  else ans += "@";
  
  
  return ans;
}
