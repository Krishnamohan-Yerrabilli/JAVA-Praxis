import java.util.Arrays;
import java.util.Scanner;

public class Strarray {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String[] strarr = new String[3];

        for (int row = 0; row < strarr.length; row++) {
            strarr[row] = str.next();
        }

        System.out.println(Arrays.toString(strarr));
    }
}
