package Day5;

import java.util.ArrayList;

public class CountingBits {
    public static void main(String[] args) {


        System.out.println(countingBits(5));
        // int a = 20;
        // System.out.println();
        // char [] ch = Integer.toBinaryString(a).toCharArray();
        // int len = 0;
        // for (int i = 0; i < ch.length; i++) {
        //     if(ch[i]=='1'){
               
        //         len = len+i;
        //     }
        // }
        // System.out.println(len);
    }
    
    public  static ArrayList<Integer> countingBits(int n){
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<String> binary = new ArrayList<>();
            
            for (int i = 0; i <=n; i++) {
                char [] ch = Integer.toBinaryString(i).toCharArray();
                binary.add(Integer.toBinaryString(i));
                int len = 0;
                for (int j = 0; j < ch.length; j++) {
                    if(ch[j]=='1'){
                    
                        len = len+i;
                        // System.out.println(len);
                    }
                }
                System.out.println(binary);
                list.add(len);

            }

        return list;
    }

    


}
