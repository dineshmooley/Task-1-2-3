public String[] firstSwap(String[] strings) {
  Map<Character, Integer> map = new HashMap<Character, Integer>();
  for(int i=0; i<strings.length; i++) {
    if(map.containsKey(strings[i].charAt(0)))  {
      if(map.get(strings[i].charAt(0)) == -1) continue;
      String temp = strings[map.get(strings[i].charAt(0))];
      strings[map.get(strings[i].charAt(0))] = strings[i];
      strings[i] = temp;
      
      map.put(strings[i].charAt(0), -1);
    }
    else map.put(strings[i].charAt(0), i);
  }
  
  return strings;
}
