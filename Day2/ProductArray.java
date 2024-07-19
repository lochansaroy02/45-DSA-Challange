package Day2;

public class ProductArray {



    public static void main(String[] args) {
        int [] arr = {10, 3, 5, 6, 2};
        productExceptSelf(arr);
    }


    public static void productExceptSelf(int nums[]) 
	{ 

        // code here
        long [] ans = new long[nums.length];
        long product = 1;
        for(int i = 0; i< nums.length; i++){
            if(nums[i]==0){
                // product 
            }
            product = product*nums[i];
            
        }
        System.out.println(product);
        for (int i = 0; i < ans.length; i++) {
            ans[i] = product/nums[i];
        } 
        for (int i = 0; i < ans.length; i++) {
           
            System.out.println(ans[i]);
        } 
	} 
}
