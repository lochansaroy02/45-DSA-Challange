package Day3;

import java.util.ArrayList;

public class ProductArray {
    public static void main(String[] args) {
        int [] arr = {7, 8, 6, 4, 6, 7, 3, 10, 2,3, 8, 1, 10, 4, 7, 1, 7, 3, 7, 2, 9, 8, 10, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1};
        product(arr);
        // System.out.println(product(arr));
    }

    public static void    product (int [] arr){


        long [] ans = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int prod = 1;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    continue;
                }
                prod = prod*arr[j];
            }
            ans[i] =prod;
            
        }
        

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
    
}
