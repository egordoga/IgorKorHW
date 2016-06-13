package _IK_Week2HW;

public class _04kolvo {

    public static void main(String[] args) {


        int[] arr = {14, 27, 13, 41, 5, 69, 47, 38, 99, 10, 11, 72, 18, 14, 25};
        String kol_vo = "";


        for (int i = 0; i < arr.length; i++) {
            kol_vo += arr[i];

        }
        System.out.println("Количество цифр = " + kol_vo.length());

    }


}
