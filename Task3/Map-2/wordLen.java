public Map<String, Integer> wordLen(String[] strings) {

  Map<String, Integer> map = new HashMap<String, Integer>();
  
  for(String i: strings)  {
    map.put(i, i.length());
  }
  
  return map;


}
