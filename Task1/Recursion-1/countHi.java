public int countHi(String str) {
  if(str.isEmpty()) return 0;
  if(str.startsWith("hi"))  return 1 + countHi(str.substring(2));
  return countHi(str.substring(1));
}
