public int userCompare(String aName, int aId, String bName, int bId) {
  if(aName.compareTo(bName) < 0)  return -1;
  else if(aName.compareTo(bName) > 0)  return 1;
  return Integer.compare(aId, bId);
}
