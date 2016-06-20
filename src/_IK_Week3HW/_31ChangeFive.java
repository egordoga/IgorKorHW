package _IK_Week3HW;

import java.util.Scanner;


public class _31ChangeFive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество строк");
        int raw = sc.nextInt();
        System.out.println("Введите количество колонок");
        int col = sc.nextInt();
        int matrix[][] = new int [raw][col];

        for (int i = 0; i < raw ; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = (int) (Math.random()*100);
                if (matrix[i][j] % 5 == 0){
                    matrix[i][j] = 8;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }

    }
}
