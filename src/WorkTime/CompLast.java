package WorkTime;


import java.util.Scanner;

public class CompLast {

    public static void main(String[] args) {

        int ost1;
        int ost2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        int first = sc.nextInt();
        if (first < 10) {
            ost1 = first;
        }
        else {

            ost1 = first % 10;
        }
        System.out.println("Введите второе число");
        int second = sc.nextInt();
        if (second < 10) {
            ost2 = second;
        }
        else {
            ost2 = second % 10;
        }

        if (ost1 == ost2) {
            System.out.println("true  " + "Значение = " + ost1);
        }
        else {
            System.out.println("false  " + "Значение1 = " + ost1 + " Значение2 = " + ost2);
        }

    }
}
