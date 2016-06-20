package _IK_Week3HW;


public class _32TrueFalse {

    public static void main(String[] args) {

        boolean matrix[][] = new boolean[5][5];

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = i ==j ? true : false;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }
}
