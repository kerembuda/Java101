import java.util.Arrays;

public class Matrix_Transposition {
    public static void main(String[] args) {

        int[][] matrix = new int[2][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i + 2 * j + 5;
            }
        }
        System.out.println("Our original matrix are like below: ");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        int[][] transposed_Matrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < transposed_Matrix.length; i++) {
            for (int j = 0; j < transposed_Matrix[i].length; j++) {
                transposed_Matrix[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transposed A^T Matrix are like below: ");
        for (int[] row : transposed_Matrix) {
            System.out.println(Arrays.toString(row));
        }
    }


}

