public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] ans = new String[n];
  int i=0, j=0, k=0;
  
  while (i != n)  {
    if(a[j].compareTo(b[k]) < 0) ans[i++] = a[j++];
    else if(a[j].equals(b[k])) {
      ans[i++] = a[j++];
      k++;
    }
    else ans[i++] = b[k++];
  }
  
  return ans;
}
