package Week2dop_IK;

import java.util.Scanner;

public class _724pushArr {
    public static void main(String[] args) {

        int[] arr = {4, 9, 3, 8, 5, 7, 1};

        Scanner in = new Scanner(System.in);
        System.out.println("Введите шаг сдвига ");
        int step = in.nextInt();


        int[] newArr = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            if (i + step >= arr.length) {
                newArr[i + step - arr.length] = arr[i];
            } else {
                newArr[i + step] = arr[i];
            }
        }
        for (int i = 0; i <newArr.length ; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
