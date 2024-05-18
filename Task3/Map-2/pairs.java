public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  
  for(String i: strings)  {
    map.put(String.valueOf(i.charAt(0)), String.valueOf(i.charAt(i.length() - 1)));
  }

  return map;
}
