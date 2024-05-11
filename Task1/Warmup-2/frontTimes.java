public String frontTimes(String str, int n) {
  String rep;
  if(str.length() > 3)  rep = str.substring(0, 3);
  else rep = str;
  
  String ans = "";
  for(int i=0; i<n; i++)  {
    ans += rep;
  }
  
  return ans;
}
