package WorkTime;


import java.util.Scanner;

public class Out1119 {


    public static void main(String[] args) {

        int sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        int first = sc.nextInt();
        System.out.println("Введите второе число");
        int second = sc.nextInt();
        sum = first + second;
        if (sum >= 11 && sum <= 19) {
            System.out.println("Сумма = " + (first + second));
        } else {
            System.out.println("Ничего выводить не надо");
        }

    }
}
