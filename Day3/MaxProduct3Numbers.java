package Day3;

import java.util.Arrays;

public class MaxProduct3Numbers {
    public static void main(String[] args) {
        int [] arr = {2};
        product(arr);
    }

    public static void product(int[] arr) {
        Arrays.sort(arr);
        int prod = 1;
       for (int i = arr.length -1; i >= arr.length-3 ; i--) {
            prod = prod*arr[i];
       }
       for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
       }
       System.out.println(prod);
    }

}
