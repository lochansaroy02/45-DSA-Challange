package Day3;

public class Ciel {
    public static void main(String[] args) {
        int [] arr = {3,12,24,55,66,98};
        System.out.println(ciel(arr,    98));
    }
    public static int ciel(int [] arr,int target){

        int start= 0;
        int end = arr.length-1;
        while (start<end) {
            int mid = end-(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;

    }
}
