package _IK_Week2HW;

public class _07miniHalf {
    public static void main(String[] args) {

        int[] arr = {14, 27, 13, 41, 5, 69, 47, 38, 99, 10, 11, 72, 18, 14, 25};
        int kolvo = 0;
        int sum = 0;
        double srAr1, srAr2;

        for (int i = 0; i <= arr.length / 2; i++) {
            kolvo++;
            sum += arr[i];

        }
        srAr1 = sum / kolvo;
        sum = 0;
        kolvo = 0;

        for (int i = arr.length / 2 + 1; i < arr.length; i++) {
            kolvo++;
            sum += arr[i];
        }

        srAr2 = sum / kolvo;

        if (srAr1 > srAr2){
            for (int i = 0; i <= arr.length/2 ; i++) {
                System.out.print(arr[i] + "  ");
            }
        }
        else {
            for (int i = arr.length / 2 + 1; i < arr.length; i++) {
                System.out.print(arr[i] + "  ");
            }
        }
    }
}
