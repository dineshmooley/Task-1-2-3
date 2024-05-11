public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  
  if(!isAsleep && isMorning) {
    return isMom;
  }
  
  return !isAsleep;
}
