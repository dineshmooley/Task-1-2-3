public boolean arrayFront9(int[] nums) {
  
  int count = 0;
  for(int i: nums){
    if(i == 9)  return true;
    count++;
    
    if(count == 4)  return false;
  }  
  return false;
}
