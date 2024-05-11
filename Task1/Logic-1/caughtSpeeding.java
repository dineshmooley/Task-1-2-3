public int caughtSpeeding(int speed, boolean isBirthday) {
  if(isBirthday){
    if(speed <= 60 + 5) return 0;
    else if(speed >= 61 + 5 && speed <= 80 + 5) return 1;
    else return 2;
  }
  
  if(speed <= 60) return 0;
  else if(speed >= 61 && speed <= 80) return 1;
  return 2;
}
