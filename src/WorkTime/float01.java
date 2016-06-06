package WorkTime;


import java.util.Scanner;

public class float01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите цифирь");
        double numb = sc.nextDouble();

        if (numb >= 0 && numb <= 1){
            System.out.println("Получилось!");
        }
        else {
            System.out.println("Не срослось");
        }

    }
}
