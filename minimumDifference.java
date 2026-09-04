
import java.util.Arrays;


// not best case time complexity is O(nlogn) and space complexity is O(1)
class minimumDifference {
    public int minimumDifference(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            min = Math.min(min, nums[i + k - 1] - nums[i]);
        }

        return min;
    }
}
