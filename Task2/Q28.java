//28) Write a program to find the sum of the series. The series will be like 1 +11 + 111 + 1111 +.. n terms.

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum = sum*10 + i;
        }
        
        System.out.println(sum);
    }
}
