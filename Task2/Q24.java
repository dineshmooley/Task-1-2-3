//24) Write a program to make such a pattern like a pyramid with numbers increased by 1.

class Q24    {
    public static void main(String[] args)  {
        
        int n = 4, count = 1;
        
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++)   {
                System.out.print(" ");
            }   
            
            for(int j=1; j<=i; j++) {
                System.out.print(count++ + " ");
            }
            
            System.out.println();
        }
    }
}
