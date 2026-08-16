
import java.util.*;

class maxVowels {

    public int maxVowels(String s, int k) {

        int max = 0;
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = i;

            while (i < k) {
                if (s.charAt(index) == 'a' || s.charAt(index) == 'e' || s.charAt(index) == 'i' || s.charAt(index) == 'o' || s.charAt(index) == 'u') {
                    val++;

                }
            }
            max = Math.max(max, val);
            val = 0;
        
        }

        return max;

    }
}
