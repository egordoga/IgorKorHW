package _IK_Week2HW;

public class _09moreCouple {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int count1 = 0, count2 = 0;

        for (int i = 0; i <arr1.length ; i++) {
            arr1[i] = 25 + (int) (Math.random() * 51);
            if (arr1[i] % 2 == 0) {
                count1++;
            }
            arr2[i] = 25 + (int) (Math.random() * 51);
            if (arr2[i] % 2 == 0) {
                count2++;
            }
        }
        if (count1 == count2) {
            System.out.println("Ничья");
        } else {
            if(count1 > count2) {
                System.out.println("Победил первый массив");
            } else {
                System.out.println("Победил второй массив");
            }
        }

    }
}
