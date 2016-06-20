package _IK_Week3HW;

import java.util.Scanner;

/**
 * Created by Master on 20.06.2016.
 */
public class _35CangeMaxMin_b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер матрицы");
        int size = sc.nextInt();

        int matrix[][] = new int [size][size];
        int array[] = new int[size];
        int max = 0;
        int min = 0;
        int sum = 0;

        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                sum += matrix[j][i];
            }
            array[i] = sum;
            sum = 0;

        }
        if (array[0]> array[size-1]){
            max = 0;
            min = size-1;
        } else {
            max = size-1;
            min = 0;
        }
        for (int i = 0; i <array.length - 2 ; i++) {
            if (array[i] > array[i+1]){
                max = i;
                min = i+1;

            } else {
                min = i;
                max = i+1;
            }
        }
        for (int i = 0; i < size ; i++) {

            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            array[i] = matrix[i][max];
            matrix[i][max] = matrix[i][min];
            matrix[i][min] = array[i];

        }



        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
