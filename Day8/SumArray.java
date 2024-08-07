

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SumArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        sumArray(arr, arr.length);
    }

    public static int sumArray(int[] arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                list.add(sum);

            }
        }
        Collections.sort(list);
        return getSum(list, 3, 4);
    }

    public static int getSum(ArrayList<Integer> list, int left, int right) {
        int sum = 0;
        for (int i = left - 1; i < right; i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }

}
