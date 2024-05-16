//14) Java Program to copy all elements of one array into another array.

import java.util.Scanner;

class Q14 {
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
        
        int[] ans = new int[nums.length];
        
        for(int i=0; i<nums.length; i++)    {
            ans[i] = nums[i];
        }
        
        System.out.println("Array is copied to another array");
        for(int i: ans) {
            System.out.println(i);
        }
    }
}
