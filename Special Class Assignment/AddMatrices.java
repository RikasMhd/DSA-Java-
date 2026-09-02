public class AddMatrices {
    public static void main(String[] args) {
        int[][] a = {
            {2, 4, 3},
            {1, 5, 7},
            {7, 11, 9}
        };

        int[][] b = {
            {6, 8, 7},
            {4, 5, 4},
            {3, 2, 9}
        };

        int rows = a.length;
        int cols = a[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}