package _IK_Week3HW;

import java.util.Scanner;

/**
 * Created by Master on 20.06.2016.
 */
public class _36Long01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку из нулей и единиц");
        String word = sc.next();
        int count0 = 0, count1 = 0;
        int max0 = 0, max1 = 0;
        int poz0 = 0, poz1 = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == '1') {
                        count0 = 0;
                        count1++;
                        if (count1 > max1) {
                            max1 = count1;
                            poz1 = i;
                        }
                    } else {
                        count1 = 0;
                        count0++;
                        if (count0 > max0) {
                            max0 = count0;
                            poz0 = i;
                        }
                    }

                }
        System.out.println("(" + (poz0 +2 - max0) + ", " + (poz0 + 1) + ") - цепочка нулей");
        System.out.println("(" + (poz1 +2 - max1)+ ", " + (poz1 + 1) + ") - цепочка единиц");
    }
}
