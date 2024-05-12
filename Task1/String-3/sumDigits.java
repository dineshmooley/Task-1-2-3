public int sumDigits(String str) {
  int ans = 0;
  for(int i=0; i<str.length(); i++) {
    if(Character.isDigit(str.charAt(i)))  ans += Integer.parseInt(String.valueOf(str.charAt(i)));
  }
  
  return ans;
}
