package Day4;

import java.util.Arrays;

/**
 * BalanceArray
 */
public class BalanceArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(balanceArray(arr));
    }

    public static int balanceArray(int[] arr) {

        Arrays.sort(arr);
        int ans = 0;
        int median = 0;
        if (arr.length == 0) {
            System.out.println(0);
        }
        if (arr.length % 2 == 0 && arr.length > 0) {
            median = arr[(arr.length - 1) / 2];

        } else {
            median = arr[arr.length / 2];
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            int diff = Math.abs(median - arr[i]);
            ans += diff;
        }

        return ans;
    }
}