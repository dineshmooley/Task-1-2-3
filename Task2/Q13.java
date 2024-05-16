//113) Java Program to print the smallest element in an array

import java.util.Scanner;

class Q13 {
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
        
        int min = nums[0];
        for(int i: nums)    {
            if(i < min) min = i;
        }
        
        System.out.println("The minimum value in the array is :" + min);
    }
}
