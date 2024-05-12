public int countYZ(String str) {
    int count = 0;
    str = str.toLowerCase();
    String ans = "";
    
    for(int i=0; i< str.length(); i++) {
      if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')  {
        ans += str.charAt(i);
      }
      else ans += ' ';
    }
    for(int i=1; i<ans.length(); i++) {
      if(ans.charAt(i) == ' ' && (ans.charAt(i-1) == 'z' || ans.charAt(i-1) == 'y')) count++;  
    }
    
    if(ans.charAt(ans.length() - 1) == 'z' || ans.charAt(ans.length() - 1) == 'y')  count++;
    
    return count;
  }
  