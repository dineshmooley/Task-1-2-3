public String[] allSwap(String[] strings) {
  
  Map<Character, Integer> map = new HashMap<Character, Integer>();
  for(int i=0; i<strings.length; i++) {
    if(map.containsKey(strings[i].charAt(0)))  {
      String temp = strings[map.get(strings[i].charAt(0))];
      strings[map.get(strings[i].charAt(0))] = strings[i];
      strings[i] = temp;
      
      map.remove(strings[i].charAt(0));
    }
    else map.put(strings[i].charAt(0), i);
  }
  
  return strings;
}
