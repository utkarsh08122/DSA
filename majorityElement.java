
import java.util.*;

class majorityElement {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            max = Math.max(max, map.get(nums[i]));
        }

        for (Integer i : map.keySet()) {
            if (map.get(i) == max) {
                return i;
            }
        }

        return max;
    }
}
