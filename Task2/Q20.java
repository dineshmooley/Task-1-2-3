//20) Write a programs to print following patterns

public class Q20 {
    public static void main(String[] args) {
        int n = 9;
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=2*(n-i); j++)   {
                System.out.print(" ");
            }
            
            for(int j=1; j<=i; j++) {
                System.out.print(j + " ");
            }
            
            for(int j=i; j>=2; j--) {
                System.out.print(j-1 + " ");
            }
            
            System.out.println();
        }
    }
}
