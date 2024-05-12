public String mirrorEnds(String string) {
  String ans="";
  for(int i=0; i<string.length(); i++)  {
    if(string.charAt(i) != string.charAt(string.length() - i - 1))  return ans; 
    else{
      ans += string.charAt(i);
    }
  }
  
  return ans;
}
