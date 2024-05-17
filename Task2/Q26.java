//26) Write a program to print the following pattern for the given input number

public class Q26 {
    public static void main(String[] args) {
        
        int n = 4;
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            
            for(int j=n-i+1; j<n; j++) {
                System.out.print("_");
            }
            
            for(int j=n-i+1; j<n; j++) {
                System.out.print("_");
            }
            
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        for(int i=2; i<=n; i++)  {
            for(int j=1; j<=i; j++)    {
                System.out.print("*");
            }
            
            for(int j=i+1;j<=n; j++)    {
                System.out.print("_");
            }
            
             for(int j=i+1;j<=n; j++)    {
                System.out.print("_");
            }
            
            for(int j=1; j<=i; j++)    {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
