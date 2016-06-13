package _IK_Week2HW;

public class _10functionArray {

    public static int[] splitArray(int[] arr, int start, int end){
        int[] newArr = new int [(end-start)];
        for (int i = start; i <= end ; i++) {
            newArr[i] = arr[i];
        }

        return newArr;
    }
}
