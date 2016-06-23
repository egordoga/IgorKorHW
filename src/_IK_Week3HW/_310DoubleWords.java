package _IK_Week3HW;

/**
 * Created by Master on 23.06.2016.
 */
public class _310DoubleWords {
    public static void main(String[] args) {

        String str = "один два два три три четыре Один три пять один шесть";
        String newStr = "";
        String array[] = str.split(" ");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length - 1; j++) {
                if (array[i].equals(array[j + 1]) ) {
                    array[j+1] = "";
                }

            }

        }
        for (int i = 0; i < array.length; i++) {
             newStr = newStr + array[i] + " ";

        }
        System.out.println(newStr);
        // не понятно почему вместо "" - пустого значения віводит пробел
    }
}
