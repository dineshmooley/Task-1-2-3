public boolean xyzMiddle(String str) {
    int len = str.length();
    if (len < 3) return false;
    
    int mid = len / 2;
    boolean evenLength = len % 2 == 0;
    
    if (evenLength) {
        return str.substring(mid - 2, mid + 1).equals("xyz") || 
               str.substring(mid - 1, mid + 2).equals("xyz");
    } else {
        return str.substring(mid - 1, mid + 2).equals("xyz");
    }
}
