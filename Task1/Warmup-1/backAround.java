public String backAround(String str) {
  char last = str.charAt(str.length() - 1);
  String ans = last + str + last;
  
  return ans;
}
