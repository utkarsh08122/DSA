
import java.util.Arrays;

public class threeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int min = nums[nums.length - 1];

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int val = nums[i] + nums[left] + nums[right];

                while (val > target && nums[left] == nums[left + 1]) {

                    left++;
                }

                while (val < target && nums[right] == nums[right - 1]) {
                    right--;
                }

                if (Math.abs(val - target) < Math.abs(min - target)) {
                    min = val;
                }

                if (val == target) {
                    return val;
                }

                if (val > target) {

                    left++;
                }

                if (val < target) {

                    right--;
                }
            }
        }

        return min;
    }
}
