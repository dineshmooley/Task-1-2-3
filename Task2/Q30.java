//30) Given a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.

public class Q30 {
    public static void main(String[] args) {
        
        int n = 3;
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = new int[2 * n - 1][];

        for (int sum = 0; sum <= 2 * (n - 1); sum++) {
            int length = Math.min(sum + 1, Math.min(n, 2 * n - sum - 1));
            result[sum] = new int[length];
            int index = 0;
            for (int i = 0; i <= sum; i++) {
                int j = sum - i;
                if (i < n && j < n) {
                    result[sum][index++] = matrix[i][j];
                }
            }
        }
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
