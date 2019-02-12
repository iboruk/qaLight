package com.iboruk.qalight;

public class WorkWithArray {

    int[] array = new int[]{2, 3, 4, 5};

    public static int[] reversArray (int[] temp){
        for (int i=temp.length-1; i>=0; i--){
            System.out.println(temp[i]);
        }
        return temp;
    }

    public static int[][] fillMatrix(int value) {
        int[][] matrix = new int[3][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = value;
            }
        }
        return matrix;
    }

    public static int[][] createMatrix(int x, int y, int value) {
        int[][] matrix1 = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix1[i][j] = value;
            }
        }
//        printMatrix(matrix1);
        return matrix1;
    }

    public static int[][] fillRightDiagonal (int x, int y, int value, int diagvalue){
        int[][] matrix2 = createMatrix(x, y, value);
        if (x == y) {
            int[][] templMatrix = matrix2;
            for (int i = 0; i < x; i++) {
                templMatrix[i][i] = diagvalue;
                matrix2 = templMatrix;
            }
//            printMatrix(matrix2);
        } else {
            System.out.println("Матрица не квадратная, диагональ не может быть лпределена");
        }
        return(matrix2);
    }

    public static void printMatrix(int[][] tempMatrix) {
        for (int i = 0; i < tempMatrix.length; i++) {
            for (int j = 0; j < tempMatrix[i].length; j++) {
                System.out.print("[" + tempMatrix[i][j] + "]");
            }
            System.out.println();
        }
    }
}
