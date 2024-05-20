public boolean dividesSelf(int n) {
  int temp = n;
  
  while(temp != 0)  {
    if(temp % 10 == 0 || n % (temp % 10) != 0)  return false;
    temp /= 10;
  }
  
  return true;
}
