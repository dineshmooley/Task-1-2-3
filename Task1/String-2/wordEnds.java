public String wordEnds(String str, String word) {
  String ans = "";
  if(str.length() <= word.length()) return "";
  if(str.substring(0, word.length()).equals(word))  {
    ans += str.charAt(word.length());
  }
  
  for(int i=1; i<str.length() - word.length(); i++) {
    if(str.substring(i, i+word.length()).equals(word))  {
      ans = ans + str.charAt(i-1) + str.charAt(i+word.length());
    }
  }
  
  if(str.substring(str.length() - word.length()).equals(word))  {
    ans += str.charAt(str.length() - word.length() - 1);
  }
  
  return ans;
}
