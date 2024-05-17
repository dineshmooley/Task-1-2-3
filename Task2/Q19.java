//19) Java Program to left rotate the elements of a multidimensional array

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        
        int[][] nums = new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Original array:");
        for (int[] row : nums) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < rows; i++) {
            int firstElement = nums[i][0];
            for (int j = 0; j < cols - 1; j++) {
                nums[i][j] = nums[i][j + 1];
            }
            nums[i][cols - 1] = firstElement;
        }
        
        System.out.println("Array after left rotation:");
        for (int[] row : nums) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
