public String missingChar(String str, int n) {
  String ans = "";
  int count = 0;
  for(int i = 0; i < str.length(); i++)  {
    if(count != n)  ans += str.charAt(i);
    count++;
  }
  
  return ans;
}
