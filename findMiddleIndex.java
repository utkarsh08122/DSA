class findMiddleIndex {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;

        int[] arr1 = new int[n + 1];
        int[] arr2 = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr1[i + 1] = arr1[i] + nums[i];
        }

        
        for (int i = n - 1; i >= 0; i--) {
            arr2[i] = arr2[i + 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (arr1[i] == arr2[i + 1]) {
                return i;
            }
        }

        return -1;
    }
}
