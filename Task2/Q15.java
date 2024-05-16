//15) Java Program to print the duplicate elements of an array.

import java.util.Scanner;

class Q15 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for(int i=0; i<n; i++)  {
            System.out.println("Enter the value :");
            int temp = sc.nextInt();
            nums[i] = temp;
        }
        
        int[] ans = new int[10];
        for(int i: nums)    {
            ans[i]++;
        }
        
        System.out.println("The duplicate elements of the array are :");
        for(int i=0; i<10; i++)    {
            if(ans[i] > 1)  System.out.println(i);
        }
    }
}
