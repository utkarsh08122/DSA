class findNumbers {
    public static void findNumbers(String[] args) {

        int[] nums = { 555, 901, 482, 1771 };
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String str = Integer.toString(nums[i]);
            if (str.length() % 2 == 0) {
                count++;
            }
        }
        System.out.print(count);
    }
}
