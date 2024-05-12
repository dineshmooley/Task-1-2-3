public String withoutString(String base, String remove) {
  String ans = "";
  for(int i=0; i<base.length(); i++) {
    if(i <=base.length() - remove.length() &&  base.substring(i, i+remove.length()).toLowerCase().equals(remove.toLowerCase())) {
      i+= remove.length() - 1;
    }
    else{
      ans += base.charAt(i);
    }
  }
  
  return ans;
}
