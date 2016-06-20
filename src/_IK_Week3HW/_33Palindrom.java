package _IK_Week3HW;

import java.util.Scanner;

/**
 * Created by Master on 20.06.2016.
 */
public class _33Palindrom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите слово");
        String word = sc.next();
        char [] arr = word.toCharArray();
        int j = arr.length;
        boolean temp = false;
        for (int i = 0; i <arr.length/2 ; i++) {
            j--;
            if (arr[i] != arr[j]){
                System.out.println("Не палиндром");
                break;
            } else {
                temp = true;
            }


        }
        if (temp) {
            System.out.println("Палиндром");
        }
    }
}
