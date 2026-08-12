class removeElement {
    public int removeElement(int[] nums, int val) {

        int index = 0;
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                arr[index] = nums[i];
                index++;
            }

        }
        for (int j = 0; j < nums.length; j++) {
            nums[j] = arr[j];
        }
        return index;
    }
}