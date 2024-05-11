public String extraEnd(String str) {
  if(str.length() <=2)  return str + str + str;
  
  String ans = str.substring(str.length() - 2);
  return ans + ans + ans;
}
