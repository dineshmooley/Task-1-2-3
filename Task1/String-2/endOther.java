public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  
  for(int i=0; i<a.length(); i++) {
    if(a.substring(i).equals(b))  return true;
  }
  
  for(int i=0; i<b.length(); i++) {
    if(b.substring(i).equals(a))  return true;
  }
  
  return false;
}
