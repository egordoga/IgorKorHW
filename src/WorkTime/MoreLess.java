package WorkTime;

import java.util.Scanner;


public class MoreLess {
    public static void main(String[] args) {

    int more;
    int less;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        int first = sc.nextInt();
        System.out.println("Введите второе число");
        int second = sc.nextInt();
        System.out.println("Введите третье число");
        int third = sc.nextInt();
        if (first > second) {
            if (first >third) {
                more = first;
            } else {
                more = third;
            }
        }
        else {
            if (second > third) {
                more = second;
            } else {
                more = third;
            }
        }

        if (first < second) {
            if (first < third) {
                less = first;
            }
            else {
                less = third;
            }
        }
        else {
            if (second < third) {
                less = second;
            } else {
                less = third;
            }
        }
                System.out.println("Maxi = " + more + "   Mini = " + less);

    }
}
