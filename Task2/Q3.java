// 3) Write a program for the following. Let consider 20 students in a class with the roll no 101-120. 
// We are going to split them into four groups. Based on their roll number we are going to split them with the following logics.


import java.util.Scanner;

public class Q3 {
    public static void main(String[] args)  {
        int start = 101, end = 120;
        
        System.out.println("Group 1:");
        for(int i=start; i<=end; i+=4)   {
            System.out.println(i);
        }
        System.out.println();
        
        System.out.println("Group 2:");
        for(int i=start+1; i<=end; i+=4)   {
            System.out.println(i);
        }
        System.out.println();
        
        System.out.println("Group 3:");
        for(int i=start+2; i<=end; i+=4)   {
            System.out.println(i);
        }
        System.out.println();
        
        System.out.println("Group 4:");
        for(int i=start+3; i<=end; i+=4)   {
            System.out.println(i);
        }
        System.out.println();
    }
}
