import java.util.Arrays;
import java.util.Scanner;

public class MultiD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {12, 24, 36},
                {53, 85, 95, 27, 38},
                {82, 44, 95, 76},
                {98, 24, 45},
                {43, 21},
                {59}
        };
        System.out.println();
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
