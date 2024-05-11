public String lastChars(String a, String b) {
  String ans = "";
  if(a.length() > 0)  ans += a.charAt(0);
  else ans += "@";
  if(b.length() > 0)  ans += b.charAt(b.length()-1);
  else ans += "@";
  return ans;
}
