public String theEnd(String str, boolean front) {
  
  String ans = "";
  
  if(front) ans += str.charAt(0);
  else ans += str.charAt(str.length()-1);
  
  return ans;
}
