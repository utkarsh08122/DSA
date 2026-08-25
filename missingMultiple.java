import java.util.HashMap;

class missingMultiple {
    public int missingMultiple(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        if (nums.length == 1) {
            if (nums[0] == k) {
                return k * 2;
            } else {
                return k;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(k * i)) {
                return k * i;
            }
        }

        return k * (nums.length + 1);
    }
}
