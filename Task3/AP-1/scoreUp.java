public int scoreUp(String[] key, String[] answers) {
  int n = key.length;
  int marks = 0;
  
  for(int i=0; i<n; i++)  {
    if(key[i].equals(answers[i]))  {
      marks += 4;
    }
    else if(answers[i].equals("?"))  {
      continue;
    }
    else  marks -= 1;
  }
  
  return marks;
}
