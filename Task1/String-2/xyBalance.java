public boolean xyBalance(String str) {
  boolean xExist = false;
  
  for(int i=0; i<str.length(); i++) {
    if(str.charAt(i) == 'x')  xExist = true;
    else if(str.charAt(i) == 'y') xExist = false;
  }
  
  return !xExist;
}
