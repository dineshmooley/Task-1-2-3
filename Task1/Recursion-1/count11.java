public int count11(String str) {
  if(str.isEmpty()) return 0;
  if(str.startsWith("11"))  return 1 + count11(str.substring(2));
  return count11(str.substring(1));
}
