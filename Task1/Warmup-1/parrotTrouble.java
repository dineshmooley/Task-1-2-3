public boolean parrotTrouble(boolean talking, int hour) {
  if(hour < 7 || hour > 20) return talking;
  else if(!talking) return talking; 
  return !talking;
}
