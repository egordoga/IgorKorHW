package Week2dop_IK;

import java.util.Scanner;

public class _722easy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int number = in.nextInt();

        if (number == 1) {
            System.out.println("Никакое");
        } else {
            for (int i = 2; i <=number/2 ; i++) {
                if (number%i ==0 ){
                    System.out.println("Может и не тако сложное, но число не простое");
                } else {
                    System.out.println("Вот оно - простое число");
                }

            }
        }
    }
}
