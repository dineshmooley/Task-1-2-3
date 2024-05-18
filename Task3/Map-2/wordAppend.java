public String wordAppend(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  String ans = "";
  for(String i: strings)  {
    if(map.containsKey(i)) {
      map.put(i, map.get(i) + 1);
      
      if(map.get(i) == 2) {
        ans += i;
        map.remove(i);
      }
    }
    else  {
      map.put(i, 1);
    }
  }
  
  return ans;
}
