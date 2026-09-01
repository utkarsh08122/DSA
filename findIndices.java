

// best solution
class findIndices {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        
        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        for (int j = indexDifference; j < n; j++) {

            
            int i = j - indexDifference;

            
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }

            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }

                        if (nums[maxIndex] - nums[j] >= valueDifference) {
                return new int[]{maxIndex, j};
            }

                        if (nums[j] - nums[minIndex] >= valueDifference) {
                return new int[]{minIndex, j};
            }
        }

        return new int[]{-1, -1};
    }
}









// class findIndices {
//     public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             for (int j = indexDifference + i  ; j < n; j++) {

//                 if (Math.abs(i - j) >= indexDifference &&
//                     Math.abs(nums[i] - nums[j]) >= valueDifference) {
                    
//                     return new int[]{i, j};
//                 }
//             }
//         }

//         return new int[]{-1, -1};
//     }
// }
