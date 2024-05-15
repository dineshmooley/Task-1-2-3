public int countAbc(String str) {
  if(str.isEmpty()) return 0;
  if(str.startsWith("abc") || str.startsWith("aba"))  return 1 + countAbc(str.substring(1));
  return countAbc(str.substring(1));
}
