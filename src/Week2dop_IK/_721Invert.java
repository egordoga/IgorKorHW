package Week2dop_IK;

/**
 * Created by Игорь on 15.06.2016.
 */
public class _721Invert {
    public static void main(String[] args) {
        int[] arr = {22, 36, 85, 42, 9, 36, 44, 37};
        int temp;


        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + "  ");
            temp = arr[i];
            arr[i] = arr[arr.length - i];
            System.out.print(arr[i] + "  ");
        }

    }
}
