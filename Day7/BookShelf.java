package Day7;

public class BookShelf {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2 }, { 4, 5 }, { 8, 1 } };
        System.out.println(bookshelf(arr, 4));
        // System.out.println(getMax(thisArr, 8, thisArr.length-1));

    }

    public static int bookshelf(int[][] books, int shelfWidth) {
        int shelfCount = 1;
        int shelfHight = 0;
        int sum = 0;
        int currmax = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i][0];
            if (sum > shelfWidth) {

                

                shelfHight += currmax;
                shelfCount++;
                sum = 0;
            }
        }

        return shelfHight;
    }

    public static int getMax(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
