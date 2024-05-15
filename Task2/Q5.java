// 5) Write a program to evaluate the polynomial equation


import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = b*b - 4*a*c;
        
        if (a == 0) System.out.println("a cannot be zero.");
        else if (d < 0) System.out.println("The roots are imaginary.");
        else {
            double ans1 = (-b + Math.sqrt(d)) / (2*a);
            double ans2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println("The roots are " + ans1 + " and " + ans2);
        }        
    }
}

