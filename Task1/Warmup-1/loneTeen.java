public boolean loneTeen(int a, int b) {
  
  int teenCount = 0;
  
  if(a >= 13 && a <=19) {
    teenCount++;
  }
  if(b >= 13 && b <=19) {
    teenCount++;
  }
  
  if(teenCount == 1)  return true;
  return false;
  
}
