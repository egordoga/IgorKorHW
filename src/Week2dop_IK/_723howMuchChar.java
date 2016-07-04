package Week2dop_IK;

import java.util.Scanner;

public class _723howMuchChar {
    public static void main(String[] args) {

        int kolvo = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Какую букву считаем? ");
        String symb = in.next();
        char symbol = symb.charAt(0);
        System.out.println("А строка-то какая?");
        String str = in.nextLine();
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] == symbol) {
                kolvo++;
            }
        }
        System.out.println("Количество энтих символов = " + kolvo);
    }

}
