package Day3;


public class ProductArray {
    public static void main(String[] args) {
        int [] arr = {2,3,4,2,3,4};
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
