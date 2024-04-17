public class C_Permutation {

    public static void findPermutation(String inputStr, String outputStr) {
        // base case
        if (inputStr.length() == 0) {
            System.out.println(outputStr);
            return;
        }

        // recursion task
        // backtracking step

        for (int i = 0; i < inputStr.length(); i++) {
            char currChar = inputStr.charAt(i);

            // abc b = ac

            String newStr = inputStr.substring(0, i) + inputStr.substring(i + 1);
            findPermutation(newStr, outputStr + currChar);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
        // abc 
    }
}
/*
 * public class NQueenBasic {

    public static void nQueens(char board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }

        for (int j = 0; j < board.length; j++) {
            // if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = '-'; // Backtracking
            // }
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // Check for row
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') { 
                return false;
            }
        }

        // Check upper diagonal on left side
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper diagonal on right side
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("----------- Board ------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 2; // Change n to the desired board size

        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);
    }
}

 */