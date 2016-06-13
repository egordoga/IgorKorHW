package _IK_Week2HW;


public class _01Ar_MinMax {
    public static void main(String[] args) {
        int myArr[] = {26, 39, 47, 85, 12, 8, 91, 46, 68};
        int maxi = 0, mini = 100;

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] > maxi) {
                maxi = myArr[i];
            } else if (myArr[i] < mini) {
                mini = myArr[i];
            }

        }

        System.out.print("Max = " + maxi + "  Min = " + mini);
    }
}
