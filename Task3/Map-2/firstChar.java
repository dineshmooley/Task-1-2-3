public Map<String, String> firstChar(String[] strings) {
  
  Map<String, String> map = new HashMap<String, String>();
  
  for(String i: strings)  {
    if(map.containsKey(String.valueOf(i.charAt(0)))) map.put(String.valueOf(i.charAt(0)), map.get(String.valueOf(i.charAt(0))) + i);
    else map.put(String.valueOf(i.charAt(0)), i);
  }
  
  return map;

}
