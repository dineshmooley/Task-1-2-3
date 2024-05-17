//11) Write a program to give the following output for the given input:

import java.util.Scanner;

class Q11   {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int i = 0;
        while(i<str.length())   {
            char c = str.charAt(i++);
            int times = 0;
            while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                times = (times * 10) + (str.charAt(i) - '0');
                i++;
            }
            
            for(int j=0; j<times; j++)  {
                System.out.print(c);
            }
        }
    }
}
