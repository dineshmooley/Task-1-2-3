public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Boolean> map = new HashMap<String, Boolean>();
  
  for(String i: strings)  {
    if(map.containsKey(i)) map.put(i, true);
    else map.put(i, false);
  }
  
  return map;

}
