public boolean gHappy(String str) {
  
    if(str.length() == 1)  return false; 
    if(str == "") return true;
    for(int i=1; i<str.length()-1; i++) {
      if(str.charAt(i) == 'g' && (str.charAt(i-1) != 'g' && str.charAt(i+1) != 'g'))  return false;
    }
    
    if(str.charAt(0) == 'g' && str.charAt(1) != 'g')  return false;
    if(str.charAt(str.length() - 1) == 'g' && str.charAt(str.length() - 2) != 'g')  return false;
    
    return true;
  }
  