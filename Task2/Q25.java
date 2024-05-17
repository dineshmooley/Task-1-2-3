//25) Write a program to print the following output for the given input. You can assume the string is of odd length

public class Q25 {
    public static void main(String[] args) {
        
        String input = "12345";
        int n = input.length();
        int mid = n / 2;
        
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - 1 - i) System.out.print(input.charAt(j));
                else System.out.print(" ");
            }
            System.out.println();
        }
        
        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - 1 - i) System.out.print(input.charAt(j));
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
