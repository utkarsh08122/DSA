class moveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;

        if (nums.length == 1) {
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[index] = nums[i];
                  if (index != i) {
                    nums[i] = 0;
                }

                index++;
            }

        }
        return;

    }
}