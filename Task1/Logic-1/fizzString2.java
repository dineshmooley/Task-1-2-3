public String fizzString2(int n) {
  String ans = "";
  if(n % 3 == 0)  ans += "Fizz";
  if(n % 5 == 0)  ans += "Buzz";
  
  if(n % 3 != 0 && n % 5 != 0)  return n + "!";
  
  return ans + "!";
}
