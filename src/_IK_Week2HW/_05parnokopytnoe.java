package _IK_Week2HW;

public class _05parnokopytnoe {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int value;

        for (int i = 0; i < arr.length; i++) {
            value = (int) (Math.random() * 100);
            if (i % 2 == 0) {
                if (value % 2 == 0) {
                    arr[i] = value;
                } else {
                    arr[i] = value + 1;
                }
            } else {
                if (value % 2 == 0) {
                    arr[i] = value + 1;
                } else {
                    arr[i] = value;
                }
            }
            System.out.print(arr[i] + "  ");

        }
    }
}
