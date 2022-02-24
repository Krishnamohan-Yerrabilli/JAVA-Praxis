import java.util.Arrays;

public class Modifyarrusingfun {
    public static void main(String[] args) {
        int[] arr = {21, 45, 24, 58};
        System.out.println(Arrays.toString(arr));
        array(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void array(int[] arr){
        arr[2] = 89;
    }

}
