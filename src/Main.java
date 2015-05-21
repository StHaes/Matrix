
public class Main {
    public static void main(String[] args) {
        MyMatrix matrix = new MyMatrix(); // cheated a bit in this class
        int[][] result = matrix.multiply(matrix.A, matrix.B);

        for (int i = 0; i < (matrix.A.length); i++) { //
            for (int j = 0; j < (matrix.B[0].length); j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }

}
