boolean doubleX(String str) {
  for(int i=0; i<str.length() - 1; i++) {
    if(str.charAt(i) == 'x' && !str.substring(i, i+2).equals("xx"))  return false;
    if(str.substring(i, i+2).equals("xx"))   return true;
    
  }
  
  return false;
}
