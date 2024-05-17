//27) Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        
        int start = -1;
        int n = input1.length();
        int m = input2.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (input1.charAt(i + j) != input2.charAt(j)) break;
            }
            
            if (j == m) start =  i;
        }
        
        System.out.println(start);
    }
}
