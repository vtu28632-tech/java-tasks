import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int r = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        rotateMatrix(matrix, m, n, r);

        // Print result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }

    static void rotateMatrix(int[][] matrix, int m, int n, int r) {

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            int top = layer;
            int bottom = m - 1 - layer;
            int left = layer;
            int right = n - 1 - layer;

            List<Integer> list = new ArrayList<>();

            // Top row: left -> right
            for (int j = left; j <= right; j++) {
                list.add(matrix[top][j]);
            }

            // Right column: top+1 -> bottom
            for (int i = top + 1; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }

            // Bottom row: right-1 -> left
            for (int j = right - 1; j >= left; j--) {
                list.add(matrix[bottom][j]);
            }

            // Left column: bottom-1 -> top+1
            for (int i = bottom - 1; i > top; i--) {
                list.add(matrix[i][left]);
            }

            // Anti-clockwise rotation
            int shift = r % list.size();

            List<Integer> rotated = new ArrayList<>();

            for (int i = shift; i < list.size(); i++) {
                rotated.add(list.get(i));
            }

            for (int i = 0; i < shift; i++) {
                rotated.add(list.get(i));
            }

            int index = 0;

            // Top row
            for (int j = left; j <= right; j++) {
                matrix[top][j] = rotated.get(index++);
            }

            // Right column
            for (int i = top + 1; i <= bottom; i++) {
                matrix[i][right] = rotated.get(index++);
            }

            // Bottom row
            for (int j = right - 1; j >= left; j--) {
                matrix[bottom][j] = rotated.get(index++);
            }

            // Left column
            for (int i = bottom - 1; i > top; i--) {
                matrix[i][left] = rotated.get(index++);
            }
        }
    }
}