public int maxBlock(String str) {
  if(str == "") return 0;
  int count = 1, maxCount = 0;
  char block = str.charAt(0);
  for(int i=1; i<str.length(); i++) {
    if(block != str.charAt(i))  {
      count = 1;
      block = str.charAt(i);
    }
    else  {
      count++;
      maxCount = Math.max(maxCount, count);
    }
  }
  
  if(maxCount == 0) return 1;
  
  return maxCount;
  
  
}
