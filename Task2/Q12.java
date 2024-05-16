//12) Program to Check Whether a Character is an Alphabet or not

import java.util.Scanner;

class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char str = sc.next().charAt(0);
        if((str >='a' && str <='z') || (str >='A' && str <='Z'))  
            System.out.println("It is an Alphabet");
        else System.out.println("It is not an Alphabet");
    }
}
