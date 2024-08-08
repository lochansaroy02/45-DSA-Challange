/**
 * IntegerToWord
 */
public class IntegerToWord {

    public static void main(String[] args) {
        int a = 1234;
        integerToWord(a);

    }

    public static void integerToWord(int n) {
        String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        String[] tens = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };
        String[] teens = { "", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen" };
        String[] thousands = { "", "thousand", "million", "billion" };
        String word = "";
        int i = 0;
        while (n > 0) {
                int rem = n % 10;
                n = n / 10;
                System.out.println(rem);
                if (i % 3 == 0) {
                    word = ones[rem] + " " + word;
                } else if (i % 3 == 1) {
                    if (rem == 1) {
                        word = teens[n % 10] + " " + word;
                        n = n / 10;
                    } else {
                        word = tens[rem] + " " + word;
                    }
                } else {
                    if (rem != 0) {
                        word = ones[rem] + " hundred " + word;
                    }
                }
        }
        System.out.println(word);
    }

}