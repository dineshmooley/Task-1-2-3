public int commonTwo(String[] a, String[] b) {
  int i = 0, j = 0, count = 0;
    
    while (i < a.length && j < b.length) {
      if (a[i].equals(b[j])) {
          count++;
          String current = a[i];
          while (i < a.length && a[i].equals(current)) i++;
          while (j < b.length && b[j].equals(current)) j++;
      } 
      else if (a[i].compareTo(b[j]) < 0) i++;
      else j++;
    }
    
  return count;
}
