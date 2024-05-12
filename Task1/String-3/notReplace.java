public String notReplace(String str) {
    String ans = "";
  
    for(int i = 0; i < str.length(); i++) {
        if ((i == 0 || !Character.isLetter(str.charAt(i - 1))) && str.substring(i).startsWith("is") && (i + 2 == str.length() || !Character.isLetter(str.charAt(i + 2)))) {
            ans += "is not";
            i += 1; 
        } else {
            ans += str.charAt(i);
        }
    }
  
    return ans;
}
