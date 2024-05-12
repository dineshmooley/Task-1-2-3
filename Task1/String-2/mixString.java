public String mixString(String a, String b) {
  int n = Math.min(a.length(), b.length());
  String ans = "";
  for(int i=0; i<n; i++)  {
    ans = ans + a.charAt(i) + b.charAt(i);
  }
  
  if(b.length() > n)  {
    ans += b.substring(n);
  }
  
  if(a.length() > n)  {
    ans += a.substring(n);
  }
  
  return ans;
}
