// 1) Write a program to print a letters from the user input character to 'Z' without using strings.

import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char input = sc.next().charAt(0);
        
        while(input <= 'Z') {
            System.out.print(input++);
        }
    }
}
