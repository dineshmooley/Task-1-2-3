public int makeChocolate(int small, int big, int goal) {
  int res = goal - 5 * big;
  if(res <= 0)  {
    goal %= 5;
    if(goal <= small) return goal;
    else return -1;
  }
  else if(res <= small) return res;
  return -1;
}
