package _IK_Week3HW;

import java.util.Scanner;

/**
 * Created by Master on 20.06.2016.
 */
public class _34Diagonal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер матрицы");
        int size = sc.nextInt();

        int matrix[][] = new int [size][size];
        int array[] = new int[size];

        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random()*100);
                if (i == j){
                    array[i] = matrix[i][j];
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + "  ");

        }
    }
}
