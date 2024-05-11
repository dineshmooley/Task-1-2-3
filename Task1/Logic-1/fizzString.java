public String fizzString(String str) {
  String ans = "";
  if(str.charAt(0) == 'f')  ans += "Fizz";
  if(str.charAt(str.length() - 1) == 'b') ans += "Buzz";
  if(ans.equals("")) return str;
  return ans;
}
