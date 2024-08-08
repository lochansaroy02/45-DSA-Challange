package Day9;

import java.util.ArrayList;
import java.util.List;

public class WordContainingChar {
    public static void main(String[] args) {
        String[] s = { "abc", "bcd", "aaaa", "cbc" };
        char x = 'c';
        wordContainingChar(s, x);
    }

    public static void  wordContainingChar(String[] words, char c) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(c))) {
                list.add(i);
            }
        }
    }

}
