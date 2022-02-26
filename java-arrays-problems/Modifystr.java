import java.util.Arrays;
import java.util.Scanner;

public class Modifystr {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String[] strarr = new String[3];

        for (int row = 0; row < strarr.length; row++) {
            strarr[row] = str.next();
        }

        System.out.println(Arrays.toString(strarr));

        //modify the string
        strarr[0] = "Google";
        //print modify version
        System.out.println(Arrays.toString(strarr));
    }
}
