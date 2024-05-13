public boolean linearIn(int[] outer, int[] inner) {
  int i = 0;
  if(inner.length == 0) return true;
  for(int j: outer) {
    if(j == inner[i])
      i++;
    if(i == inner.length) return true;
  }
  
  return false;
}
