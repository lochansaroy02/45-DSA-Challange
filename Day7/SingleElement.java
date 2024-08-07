package Day7;

public class SingleElement {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleElement(arr));
    }

    public static int singleElement(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                return mid;
            }
            if (arr[mid] == arr[mid - 1]) {
                if (end - mid % 2 == 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if ((end - mid + 1) % 2 == 0) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;

    }
}
