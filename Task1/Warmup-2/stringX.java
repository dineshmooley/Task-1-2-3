public String stringX(String str) {
  
  if(str.length() < 2)  return str;
  String ans = "";
  
  for(int i=1; i<str.length() - 1; i++) {
    if(str.charAt(i) != 'x')  ans += str.charAt(i);
  }
  
  return str.charAt(0) + ans + str.charAt(str.length() - 1);
}
