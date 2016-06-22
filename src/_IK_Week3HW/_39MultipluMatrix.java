package _IK_Week3HW;

/**
 * Created by Master on 22.06.2016.
 */
public class _39MultipluMatrix {
    public static void main(String[] args) {

        int matrix1[][] = new int[5][5];
        int matrix2[][] = new int[5][5];
        int matrix[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix1[i][j] = (int) (Math.random() * 10);
                matrix2[i][j] = (int) (Math.random() * 10);
                matrix[i][j] = matrix1[i][j] * matrix2[i][j];
            }
        }
    }
    /*  Что-то очень просто
        Возможно, я не так понял задание
     */
}
