//24) Write a program to make such a pattern like a pyramid with numbers increased by 1.

public class Q24 {
    public static void main(String[] args) {
        int n = 10, rows = 0, elementsInRow = 1, temp = n;
        while (temp > 0) {
            rows++;
            temp -= elementsInRow;
            elementsInRow++;
        }
        
        int currentNumber = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i && currentNumber <= n; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }
            
            System.out.println();
        }

    }
}
