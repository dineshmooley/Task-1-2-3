public int countTriple(String str) {
  int triples = 0;
  if(str.length() < 3)  return 0;
  for(int i=0; i<str.length() - 2; i++) {
    if(str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2))  triples++;
  }
  
  return triples;
}
