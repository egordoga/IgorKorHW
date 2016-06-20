package _IK_Week3HW;

/**
 * Created by Master on 20.06.2016.
 */
public class _37LongWord {
    public static void main(String[] args) {

        String str = "Напишите программу, которая позволяет пользователю ввести в консоли строку";
        String array[] = str.split(" ");
        int max = 0;
        int poz = 0;
        int res;

        for (int i = 0; i < array.length; i++) {
            res = array[i].length();
            if (res > max) {
                max = res;
                poz = i;
            }

        }
        System.out.println("Самое большое слово - " + array[poz]);
    }
}
