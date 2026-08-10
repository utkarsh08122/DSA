import java.util.*;

class Solution {
    public int maximumWealth(int[][] accounts) {

        int max = 0;
        int min = 0;

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                min = min + accounts[i][j];
            }
            max = Math.max(min, max);
            min=0;

        }
        return max;
    }
}