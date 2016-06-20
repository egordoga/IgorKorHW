package _IK_Week3HW;

/**
 * Created by Master on 20.06.2016.
 */
public class RandomMatrix {

    public static int[][] randomMatrix (int raw, int col) {

        int [][] matrix = new int[raw][col];

        for (int i = 0; i < raw ; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = (int) (Math.random()*100);

            }

        }
    return matrix;
    }
}
