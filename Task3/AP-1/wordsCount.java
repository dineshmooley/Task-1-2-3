public int wordsCount(String[] words, int len) {
  int count = 0;
  
  for(String i: words)  {
    if(i.length() == len) count++;
  }
  
  return count;
}
