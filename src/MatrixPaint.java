public class MatrixPaint {
    public static void main(String[] args) {
        String[][] matrix = new String[8][11];

        //initialize the array dudes in to place
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0) {
                    matrix[i][j] = "*";
                } else if (i > 1 && j == 5) {
                    matrix[i][j] = "*";
                } else if (i > 1 && j == 10) {
                    matrix[i][j] = "*";
                } else if (i == 0) {
                    matrix[i][2] = "*";
                    matrix[i][3] = "*";
                    matrix[i][7] = "*";
                    matrix[i][8] = "*";
                } else if (i == 1) {
                    matrix[i][1] = "*";
                    matrix[i][4] = "*";
                    matrix[i][6] = "*";
                    matrix[i][9] = "*";
                } else {
                    matrix[i][j] = " ";
                }
            }
        }
        //print matrix
        for (String[] row: matrix) {
            for (String column: row) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
