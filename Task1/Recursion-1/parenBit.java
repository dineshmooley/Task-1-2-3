public String parenBit(String str) {
  if (str.isEmpty()) return "";
  if (str.charAt(0) == '(') {
   int endIndex = str.indexOf(')');
   return str.substring(0, endIndex + 1);
  }
  return parenBit(str.substring(1));
}
