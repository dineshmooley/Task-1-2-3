public int sumNumbers(String str) {
  int sum = 0;
  
  for(int i=0; i<str.length(); i++) {
    int temp = 0;
    while(Character.isDigit(str.charAt(i)) && i < str.length()-1)  {
      temp = temp * 10 + (str.charAt(i) - '0');
      i++;
    }
    if(i == str.length() - 1 && Character.isDigit(str.charAt(i)))  {
      temp = temp * 10 + (str.charAt(str.length() - 1) - '0');
    }
    sum += temp;
  }
  
  
  return sum;
}
