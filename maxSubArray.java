class maxSubArray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            min = Math.max(nums[i], min + nums[i]);
            max = Math.max(max, min);
        }

        return max;
    }
}