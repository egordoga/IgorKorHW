package _IK_Week3HW;

/**
 * Created by Master on 21.06.2016.
 */
public class _38ToUp {
    public static void main(String[] args) {
        String str = "иван васильевич";

        String array[] = str.split(" ");
        String res = (array[0].substring(0,1)).toUpperCase() + array[0].substring(1) +
                " " + (array[1].substring(0,1)).toUpperCase() + array[1].substring(1);
        System.out.println(res);
    }
}
