public class J_Sudoku {

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // base
        if (row == 9) {
            return true;
        }

        // recursion
        // check sudoku boundary
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // return if cell have already digit
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // set digit
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;

                // return true if more cell true
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0; // backtracking
            }
        }
        return false;
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {

        // check duplicate value in colum horizontally
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // check duplicate value in row vertically
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // check duplicate value in 3x3 cell
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("- - - - - - - - - - -");
            }
            for (int j = 0; j < sudoku[i].length; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print(" | ");
                }
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] sudoku = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        // Print the Sudoku grid
        sudokuSolver(sudoku, 0, 0);
        printSudoku(sudoku);
    }
}
