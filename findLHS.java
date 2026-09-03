

import java.util.*;
class findLHS {
    public int findLHS(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

       
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;

      
        for (int num : map.keySet()) {

            if (map.containsKey(num + 1)) {
                int length = map.get(num) + map.get(num + 1);

                max = Math.max(max, length);
            }
        }

        return max;
    }
}



// not best solution O(n2)

// class findLHS {
//     public int findLHS(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int max = 0;

//         for (int i = 0; i < nums.length; i++) {
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         }

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (Math.abs(nums[i] - nums[j]) == 1) {
//                     max = Math.max(max, map.get(nums[i]) + map.get(nums[j]));
//                 }
//             }
//         }

//         return max;
//     }
// }
