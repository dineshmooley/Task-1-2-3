public boolean xyzThere(String str) {
  if(str.length() < 3)  return false;
  
  for(int i=0; i<str.length() - 2; i++) {
    if(i == 0 && str.substring(0, 3).equals("xyz")) return true;
    
    if(str.substring(i, i+3).equals("xyz") && str.charAt(i-1) != '.') return true;
  }
  
  return false;
}
