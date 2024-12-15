import java.util.Random;
public class Task13 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[4][4];
        int maxOnesInRow = 0;
        int maxOnesInColumn = 0;
        int rowIndexOfMaxOnes = 0;
        int columnIndexOfMaxOnes = 0;

        // Fill the matrix with random 0s and 1s
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(String.format("%d", matrix[i][j]));
            }
            System.out.println();
        }

        // Find the row with the most 1s
        for (int i = 0; i < matrix.length; i++) {
            int onesCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount > maxOnesInRow) {
                maxOnesInRow = onesCount;
                rowIndexOfMaxOnes = i;
            }
        }

        // Find the column with the most 1s
        for (int j = 0; j < matrix[0].length; j++) {
            int onesCount = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount > maxOnesInColumn) {
                maxOnesInColumn = onesCount;
                columnIndexOfMaxOnes = j;
            }
        }

        System.out.println("The largest row index: " + rowIndexOfMaxOnes);
        System.out.println("The largest column index: " + columnIndexOfMaxOnes);
    }
}

