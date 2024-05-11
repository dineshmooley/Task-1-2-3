public String middleTwo(String str) {
  int times = str.length() / 2;
  
  while(times-- != 1)  {
    str = str.substring(1, str.length() - 1);
  }
  
  return str;
}
