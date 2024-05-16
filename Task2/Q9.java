//9) Write a program to display the number in reverse order without use of String functions.

import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();
        int ans = 0;
        while(input != 0)   {
            int temp = input % 10;
            ans = (ans * 10) + temp;
            input /= 10;
        }
        
        System.out.println(ans);
    }
}
