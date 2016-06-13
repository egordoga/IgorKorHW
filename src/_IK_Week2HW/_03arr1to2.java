package _IK_Week2HW;


public class _03arr1to2 {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int buffer;

        System.out.println("Было1 Было2 Стало1 Стало2");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "     " + arr2[i]);

            buffer = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = buffer;

            System.out.println("      " + arr1[i] + "     " + arr2[i]);
        }

    }

}
