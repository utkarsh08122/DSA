class pivotIndex {
  public int pivotIndex(int[] nums) {

    int left = 0;
    int right = 0;

    for (int i = 0; i < nums.length; i++) {
      right = right + nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
      if (i == 0) {
        left = 0;
        right = right - nums[i];
        if (left == right) {
          return i;
        }
      } else {
        right = right - nums[i];
        left = left + nums[i - 1];

        if (left == right) {
          return i;
        }

      }

    }

    return -1;
  }
}