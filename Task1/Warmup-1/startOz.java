public String startOz(String str) {
  String ans = "";
  if(str.length() <= 1)  return str;
  if(str.charAt(0) == 'o')  ans += 'o';
  if(str.charAt(1) == 'z')  ans += 'z';
  
  return ans;
}
