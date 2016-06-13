package _IK_Week2HW;


public class _06srednArif {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 26};
        float kol_vo = 0;
        float summa = 0;


        for (int i = 0; i < arr.length; i++) {
            kol_vo ++;
            summa += arr[i];

        }
        System.out.println("Среднее арифметическое = " + (summa/(kol_vo)));

    }

}
