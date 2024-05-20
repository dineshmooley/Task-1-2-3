public int matchUp(String[] a, String[] b) {
  
  int n = a.length; 
  int count = 0;
  for(int i=0; i<n; i++)  {
    if(!a[i].equals("") && !b[i].equals("") && a[i].charAt(0) == b[i].charAt(0))  count++;
  }
  
  return count;
}
