public String extraFront(String str) {
  if(str.length() < 2)  return str + str + str;
  String ans = str.substring(0, 2);
  return ans + ans + ans;
}
