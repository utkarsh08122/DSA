import java.util.*;

//  best slution 
class longestConsecutive {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        // Put all numbers into HashSet
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;

        // Check every number
        for (int num : set) {

            // Only start if num is the beginning
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                // Find consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}



// not best solution 

// class longestConsecutive {
//     public int longestConsecutive(int[] nums) {

//         if (nums.length == 0 || nums.length == 1) {
//             return nums.length;
//         }

//         Arrays.sort(nums);

//         int count = 1;
//         int old = nums[0];
//         int max = 0;

//         for (int i = 1; i < nums.length; i++) {

//             if (old == nums[i]) {
//                 continue;
//             }

//             if (nums[i] == old + 1) {
//                 old++;
//                 count++;
//             } else {
//                 max = Math.max(max, count);
//                 count = 1;
//                 old = nums[i];
//             }
//         }

//         return Math.max(max, count);
//     }
// }