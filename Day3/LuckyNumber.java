package Day3;

import java.util.ArrayList;
import java.util.HashSet;

public class LuckyNumber {
        public static void main(String[] args) {
            // int  [] arr = {3,4,6,2,3,5,6,4,6,6,3,2,4,6,5,3,21,23,5,46,44,3,4};
            // System.out.println(getMax(arr));
            // System.out.println(getMin(arr));

            int [][] arr2 ={{1,10,4,2},
                            {9,3,8,7},
                            {15,16,17,12}};
            // luckyNumber(arr2);
            System.out.println(luckyNumber(arr2));
        }



        public static ArrayList<Integer>  luckyNumber( int [][] arr){


            ArrayList<Integer> maxItem = new ArrayList<>();
            ArrayList<Integer> minItem = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                int min  = Integer.MAX_VALUE;
                for (int j = 0; j < arr.length; j++) {
                        min =  Math.min(min, arr[i][j]);
                        
                }
                minItem.add(min);
            }
            for (int j = 0;j  < arr.length; j++) {
                int max  = Integer.MIN_VALUE;
                for (int i = 0; i < arr.length; i++) {
                        max =  Math.max(max, arr[i][j]);
                        
                }
                maxItem.add(max);
            }
     


            ArrayList<Integer> commonItems = new ArrayList<>();
            HashSet<Integer> maxSet = new HashSet<>(maxItem);
    
            for (int item : minItem) {
                if (maxSet.contains(item)) {
                    commonItems.add(item);
                }
            }
            return commonItems;
        

        }

}
