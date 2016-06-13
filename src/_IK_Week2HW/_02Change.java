package _IK_Week2HW;


public class _02Change {
    public static void main(String[] args) {


        int myArr[] = {33, 57, 6, 88, 26, 39, 47, 85, 12, 8, 91, 46, 68};
        int maxi = 0, mini = 100;
        int buffer;
        int minimesto = 0, maximesto = 0;

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] > maxi) {
                maxi = myArr[i];
                maximesto = i;
            } else if (myArr[i] < mini) {
                mini = myArr[i];
                minimesto = i;
            }

        }
        buffer = myArr[minimesto];
        myArr[minimesto] = myArr[maximesto];
        myArr[maximesto] = buffer;

        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + "  ");
        }


    }
}
