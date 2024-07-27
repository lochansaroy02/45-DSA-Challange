package Day6;

import java.math.BigInteger;

public class MaximumResult {
    public static void main(String[] args) {
        

        System.out.println(maxResult("2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471",'5'));

    }

    public static String maxResult(String number, char d){
        BigInteger maximum = BigInteger.ZERO; 
        for (int i=0; i < number.length(); i++) {
            char c = number.charAt(i);
            if(c==d){
                String num = number.substring(0, i) + number.substring(i +1);
                BigInteger thisNum = new BigInteger(num);
                maximum = maximum.max(thisNum);
            }
        }
        return maximum.toString();
    }


}
