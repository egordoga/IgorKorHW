package WorkTime;


import java.util.Scanner;

public class div7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите цифирь");
        int numb = sc.nextInt();

        if (numb % 7 == 0){
            System.out.println("Новая цифирь " + numb*2);
        }
        else {
            System.out.println("Не срослось");
        }

    }

}
