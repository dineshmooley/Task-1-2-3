public String stringYak(String str) {
  while(str.indexOf("yak") != -1) {
    if(str.indexOf("yak") == 0) str = str.substring(3);
    else str =  str.substring(0, str.indexOf("yak")) + str.substring(str.indexOf("yak") + 3);
  }
  
  return str;
}
