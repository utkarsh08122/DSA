import java.util.*;

class missingNumber {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        int old = nums[nums.length-1];
       
       

        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        old++;
        return old;
    }
}
