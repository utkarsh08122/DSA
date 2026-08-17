
import java.util.*;



class firstMissingPositive {
  public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);
        int min = 1;
        if (nums.length == 1) {
            return nums[0] <= 0 ? 1 : nums[0] > 1 ? 1 : 2;
        }


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            }
            
            if (nums[i] == min ) {
                 min++;
            }
           
        }

        return min;

    }
}