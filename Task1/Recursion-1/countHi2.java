public int countHi2(String str) {
  if(str.isEmpty()) return 0;
  if(str.startsWith("hi")) return 1 + countHi2(str.substring(2));
  if(str.startsWith("xhi")) return countHi2(str.substring(3));
  return countHi2(str.substring(1));
}
