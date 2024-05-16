//10) Using Recursion, reverse the string such as

import java.util.Scanner;

class Q10 {
    
    static String reverseWords(String str) {
        if (str.isEmpty() || str.indexOf(' ') == -1)    return str;
       return reverseWords(str.substring(str.indexOf(' ') + 1)) + " " + str.substring(0, str.indexOf(' '));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        System.out.println(reverseWords(input));
    }
}
