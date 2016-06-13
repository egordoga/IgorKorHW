package _IK_Week2HW;

public class _08arrSum {
    public static void main(String[] args) {


        int[] arr1 = {14, 52, 63, 43, 5, 61, 71, 18, 59};
        int[] arr2 = {95, 88, 27, 46, 57, 45, 3, 22, 10};
        int sumarr[] = new int[9];


        for (int i = 0; i < arr1.length; i++) {

            sumarr[i] = arr1[i] + arr2[i];

            System.out.print(sumarr[i] + " ");
        }
    }

}
