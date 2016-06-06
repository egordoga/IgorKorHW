package WorkTime;

import java.util.Scanner;


public class SumDif {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        int first = sc.nextInt();
        System.out.println("Введите второе число");
        int second = sc.nextInt();

        if (first > second) {
            System.out.println("Разность " + (first - second));
        }
        else {
            System.out.println("Сумма " + (first + second));
        }

    }
}
