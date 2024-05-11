public String withoutX2(String str) {
    if((str.length() == 1 && str.charAt(0) == 'x') || str.length() == 0) return "";
    if(str.charAt(1) == 'x') str = str.charAt(0) + str.substring(2);
    if(str.charAt(0) == 'x') str = str.substring(1);
  return str;
}
