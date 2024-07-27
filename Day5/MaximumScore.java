package Day5;

public class MaximumScore {
    public static void main(String[] args) {
        int[] arr = { 11, 49, 100, 20, 86, 29, 72 };
        System.out.println(maxScoreOptmized(arr, 4));
    }

    public static int maxScore(int[] arr, int k) {
        int sum = 0;

        int count = 0;
        int i = 0;
        int j = arr.length - 1;
        while (count < k) {
            if (arr[i] > arr[j]) {
                sum += arr[i];
                i++;
            } else {
                sum += arr[j];
                j--;
            }
            count++;
        }

        return sum;
    }

    public static int maxScoreOptmized(int[] arr, int k) {
        int n = arr.length;
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        int maxSum = currentSum;
        for (int i = 0; i < k; i++) {
            currentSum = currentSum - arr[k - 1 - i] + arr[n - 1 - i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;

    }
}
