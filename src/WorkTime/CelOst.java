package WorkTime;


import java.util.Scanner;

public class CelOst {

    public static void main(String[] args) {

        int cel;
        int ost;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        int first = sc.nextInt();
        System.out.println("Введите второе число");
        int second = sc.nextInt();

        ost = first % second;
        cel = first / second;

        if (ost == 0) {
            System.out.println("true  " + "Целое = " + cel);
        }
        else {
            System.out.println("false  " + "Целое = " + cel + " Остаток = " + ost);
        }

    }
}
