import java.util.ArrayList;

public class Matrix {
    public static ArrayList<Integer> numbersDivisibleByThree(int[][] matrix) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 3 == 0) {
                    if (!numbers.contains(matrix[i][j])) {
                        numbers.add(matrix[i][j]);
                    }
                }
            }
        }
        return numbers;
    }

    public static int minimum(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        return min;
    }
}