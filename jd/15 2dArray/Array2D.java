import java.util.Scanner;

public class Array2D {

    public static void create2DArray() {
        int matrix[][] = new int[3][3];

        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter matrix element:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void printMatrix(int arr[][]) {
        System.out.println("Your elements are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean findElement(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {

                    System.out.println("Element " + key + " find at index (" + i + "," + j + ").");
                    return true;

                }
            }
        }
        System.out.println("Element not found!");
        return false;
    }

    public static void printSpiral_JD(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int startRow = 0;
        int startCol = 0;
        int endRow = rows - 1;
        int endCol = cols - 1;

        while (startRow <= endRow && startCol <= endCol) {

            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");

            }

            for (int j = endCol - 1; j >= startCol; j--) {
                if (startCol == endCol) {
                    break;
                }

                System.out.print(matrix[endRow][j] + " ");
            }

            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }
    }

    public static void printSpiral(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int startRow = 0;
        int startCol = 0;
        int endRow = rows - 1;
        int endCol = cols - 1;

        while (startRow <= endRow && startCol <= endCol) {

            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            if (startRow < endRow && startCol < endCol) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }

                for (int i = endRow - 1; i > startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        int n = matrix.length;
        int m = matrix[0].length;

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // if (i == j) {
        // sum += matrix[i][j];
        // } else if (i + j == n - 1) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        return sum;
    }

    public static boolean stairSearch(int matrix[][], int key) {
        int n = matrix.length;
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < n && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Element found at  position " + row + " , " + col);
                return true;
            }

            else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }

        }

        System.out.println("Element not found!");
        return false;
    }

    public static void main(String[] args) {

        // create2DArray();
        // printMatrix(matrix);
        // findElement(matrix, 4);

        int spiralData[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };
        // printSpiral_JD(spiralData);

        int diagonalSumData[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // System.out.println(diagonalSum(diagonalSumData));

        int sortedRCData[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        stairSearch(sortedRCData, 48);

    }
}
