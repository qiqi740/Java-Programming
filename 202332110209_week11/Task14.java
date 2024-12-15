public class Task14 {
    public static void shuffle(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                int i1 = (int)(Math.random() * matrix.length);
                int j1 = (int)(Math.random() * matrix[row].length);
                int temp = matrix[row][column];
                matrix[row][column] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] m = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}
        };

        System.out.println("Original matrix:");
        printMatrix(m);
        shuffle(m);
        System.out.println("Shuffled matrix:");
        printMatrix(m);
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

