public boolean mixStart(String str) {
  if(str.length() < 3) return false;
  return str.charAt(1) == 'i' && str.charAt(2) == 'x';
}
