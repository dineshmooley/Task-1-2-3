public String doubleChar(String str) {
  
  String ans = "";
  for(int i=0; i<str.length(); i++)  {
    ans = ans + str.charAt(i) + str.charAt(i);
  }
  
  return ans;
}
