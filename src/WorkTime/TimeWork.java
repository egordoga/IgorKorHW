package WorkTime;
import java.util.Scanner;


public class TimeWork {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Введите время");
        int time = sc.nextInt();
        if (time >= 0 && time <= 24) {
            if (time >= 9 && time <= 18) {
                System.out.println("Работаю я");
            } else {
                System.out.println("Меня покорил диван");
            }
        } else {
            System.out.println("Время Вам не подвластно");
        }
    }
}