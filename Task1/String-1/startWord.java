public String startWord(String str, String word) {
  
  if(word.length() > str.length())  return "";
  String ans = "";
  
  for(int i=1; i<word.length(); i++)  {
    if(str.charAt(i) == (word.charAt(i)))  ans += word.charAt(i);
    else return "";
  }
  
  return str.charAt(0) + ans;
}
